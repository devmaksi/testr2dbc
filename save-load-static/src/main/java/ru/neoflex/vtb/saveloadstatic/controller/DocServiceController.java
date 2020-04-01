package ru.neoflex.vtb.saveloadstatic.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.MediaType;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.neoflex.vtb.saveloadstatic.model.TestTable;

import java.util.Date;

@Log4j2
@RestController
public class DocServiceController {

    @Autowired
    DatabaseClient client;

    @PostMapping("/save")
    public Mono<String> save(@RequestPart("files") Flux<FilePart> filePartFlux, @RequestHeader("msa-user-id")  String auth){
        filePartFlux.flatMap(it ->
                client.insert()
                        .into("doc_storage")
                        .value("id", auth)
                        .value("name", it.filename())
                        .value("date", new Date())
                        .value("doc", it.content())
                        .then()
                ).then();
        return Mono.just("OK");
    }

    @PostMapping(value = "/testModel", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<TestTable>testModel(@RequestBody TestTable testModel){
        client.insert().into("test_table").value("name",testModel.getName()).value("age",testModel.getAge()).then();
        Flux<TestTable> tableFlux = client.select().from(TestTable.class).as(TestTable.class).all();
        return tableFlux;
    }

}
