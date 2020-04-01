package ru.neoflex.vtb.saveloadstatic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.File;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocModel {

    @Id String id;
    private String name;
    private Date date;
    private byte[] file;

}
