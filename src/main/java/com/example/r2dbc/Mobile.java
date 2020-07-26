package com.example.r2dbc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Data
@ToString
@Builder
@Table("mobile")
@AllArgsConstructor
@NoArgsConstructor
public class Mobile implements Serializable {

    @Id
    @Column("id")
    private Long id;

    @Column("brand")
    private String brand;

    @Column("battery_capacity")
    private Long batteryCapacity;

}
