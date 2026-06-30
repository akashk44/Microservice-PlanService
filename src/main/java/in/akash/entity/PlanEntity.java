package in.akash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "plan_details")
public class PlanEntity {

    @Id
    private String planId;
    private String planName;
    private String description;
    private String validity;
}
