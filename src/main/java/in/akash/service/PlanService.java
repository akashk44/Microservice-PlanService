package in.akash.service;

import in.akash.entity.PlanEntity;
import in.akash.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    PlanRepository planRepository;

    public List<PlanEntity> getAllPlans() {
        return planRepository.findAll();
    }

    public PlanEntity getPlanById(String planId) {
        return planRepository.findById(planId).orElseThrow(() -> new RuntimeException("Plan not found with id: " + planId));
    }

}
