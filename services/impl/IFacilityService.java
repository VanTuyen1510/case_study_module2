package Furama.services.impl;

import Furama.models.Facility;
import Furama.services.ICustomerService;
import Furama.services.IService;

import java.util.Map;

public interface IFacilityService extends IService {
    Map<Facility,Integer> displayFacility();
    void addFacility();
    void updateFacility();
    Map<Facility,Integer> displayMaintenance();

}
