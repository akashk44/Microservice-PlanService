package in.akash.api;

import in.akash.entity.PlanEntity;
import in.akash.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlanRestController {

    @Autowired
    PlanService planService;

    @GetMapping(value = "/plans", produces = "application/json")
    public ResponseEntity<List<PlanEntity>> getPlans() {
        return new ResponseEntity<>(planService.getAllPlans(), org.springframework.http.HttpStatus.OK);
    }

    @GetMapping(value = "/plans/{planId}", produces = "application/json")
    public ResponseEntity<PlanEntity> getPlanById(@PathVariable(value = "planId") String planId) {
        PlanEntity plan = planService.getPlanById(planId);
        if (plan != null) {
            return new ResponseEntity<>(plan, org.springframework.http.HttpStatus.OK);
        } else {
            return new ResponseEntity<>(org.springframework.http.HttpStatus.BAD_REQUEST);
        }
    }
}
