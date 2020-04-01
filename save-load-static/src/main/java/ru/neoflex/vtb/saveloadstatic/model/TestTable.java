package ru.neoflex.vtb.saveloadstatic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("test_table")
public class TestTable {
    @Id
    private int id;
    @Column("name")
    private String name;
    @Column("age")
    private int age;

}
