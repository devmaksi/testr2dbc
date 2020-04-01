package ru.neoflex.vtb.mocktba.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.vtb.mocktba.model.CreditCardProduct;
import ru.neoflex.vtb.mocktba.model.event.RequestEvent;
import ru.neoflex.vtb.mocktba.model.status.OneOfIssueCardStatusItems;
import ru.neoflex.vtb.mocktba.utils.StateMachine;
import ru.neoflex.vtb.mocktba.utils.StateRepo;

import javax.validation.Valid;
import java.io.*;
import java.util.List;


@RestController
public class ApiComponent {

    Logger logger = LoggerFactory.getLogger(ApiComponent.class);

    @GetMapping("/virtual/offers/{offerId}/products")
    @ResponseBody
    public List<CreditCardProduct> virtualOffersOfferIdProductsGet(@PathVariable("offerId") String offerId, @RequestHeader("msa-user-id")  String auth) throws IOException {
        logger.info("auth: {}", auth);
        String fileName = "./credit-card-product/" + offerId + ".json";
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CreditCardProduct>> typeReference = new TypeReference<List<CreditCardProduct>>() {};
        List<CreditCardProduct> productList = objectMapper.readValue(new File(fileName), typeReference);
        if(productList.size() != 0){
            StateMachine stateMachine = StateRepo.getOldStateMachineOrNew(auth);
            logger.info("StateMachine currentStep: {}, currentState {}", stateMachine.getCurrentStrep(), stateMachine.getStatus());
            logger.info("stateStatus: {}", stateMachine.getStatus());
        }
        return productList;
    };

    @PostMapping("/virtual/issue_card")
    public OneOfIssueCardStatusItems virtualIssueCardPost(@RequestBody RequestEvent issueCardEvent,@RequestHeader("msa-user-id") String auth) throws Exception {
        StateMachine stateMachine = StateRepo.getOldStateMachineOrNew(auth);
        logger.info("Old StateMachine currentStep: {}, currentState {}", stateMachine.getCurrentStrep(), stateMachine.getStatus());
        if(stateMachine.validStep(issueCardEvent.getEvent().getName())){
            OneOfIssueCardStatusItems oneOfIssueCardStatusItems = stateMachine.changeAndGetStatus();
            logger.info("New StateMachine currentStep: {}, currentState {}", stateMachine.getCurrentStrep(), stateMachine.getStatus());
            return oneOfIssueCardStatusItems;
        }
        throw new Exception("Данный Event не ожидается");
    }

    @GetMapping("/virtual/issue_card")
    @ResponseBody
    public OneOfIssueCardStatusItems virtualIssueCardPost(@Valid @RequestParam(value = "poll", required = false) Boolean poll, @RequestHeader("msa-user-id") String auth) throws Exception {
        StateMachine stateMachine = StateRepo.getStateMachine(auth);
        if(stateMachine != null){
            return stateMachine.getStatus();
        }else{
            stateMachine = StateRepo.getOldStateMachineOrNew(auth);
            return stateMachine.getStatus();
        }
    }
}
