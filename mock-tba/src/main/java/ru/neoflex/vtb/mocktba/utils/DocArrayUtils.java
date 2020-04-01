package ru.neoflex.vtb.mocktba.utils;

import ru.neoflex.vtb.mocktba.model.status.Doc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DocArrayUtils {
    public static List<Doc> docList = new ArrayList<>();
    static {
        docList.add(new Doc("План мероприятий","http://static.government.ru/media/files/5eZlJABDjwE.pdf"));
        docList.add(new Doc("Пустой файл","https://spmi.ru/sites/default/files/imci_images/aspirant/portfolio/3%20year/%D0%9A%D0%B0%D0%B1%D0%B0%D0%BD%D0%BE%D0%B2%20Vedomost2.pdf"));
        docList.add(new Doc("Заявление о выдаче паспорта","http://oreol-tour.ru/files/Zajavlenie_na_zagranpasport_clear.pdf"));
        docList.add(new Doc("Заявление о выдаче паспорта на несовершеннолетнего гражданина","http://oreol-tour.ru/files/Zajavlenie_Det_Clear.pdf"));
        docList.add(new Doc("Запрос в бюро","http://oreol-tour.ru/files/Adres_clear.pdf"));
        docList.add(new Doc("Тербование, чистое в формате PDF","http://oreol-tour.ru/files/Trebovanie_clear.pdf"));
        docList.add(new Doc("Запрос в службу приставов","http://oreol-tour.ru/files/Sud_pristav_clear.pdf"));
        docList.add(new Doc("Кратокое справочное руководство","https://www.xeroxscanners.com/downloads/Manuals/XMS/PDF_Converter_Pro_Quick_Reference_Guide.RU.pdf"));
        docList.add(new Doc("Налоговая диклораци на доходы физических лиц","http://www.garant.ru/files/8/5/609358/deklaratsiya_(k_prikazu_fns_rossii_ot_03_11_2018___mmv-7-11_569_).pdf"));
        docList.add(new Doc("Справка об обучении, периоде обучения в образовательной организации","https://www.tu-bryansk.ru/upload/medialibrary/56c/spr.pdf"));
        docList.add(new Doc("Образец бланка диплома специалиста","https://www.tu-bryansk.ru/upload/medialibrary/d35/spec.pdf"));
    }

    public static List<Doc> getListDoc(){
        List<Doc> copy = docList.stream().collect(Collectors.toList());
        List<Doc> listResult = new ArrayList<>();
        int s = (int)Math.floor(Math.random() * 5);
        if(s == 0) s = 1;
        for(int i = 0; i < s; i++){
            int lr = (int)Math.floor(Math.random() * copy.size());
            listResult.add(copy.get(lr));
            copy.remove(lr);
        }
        return listResult;
    }
}
