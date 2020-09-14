package Services;

import Models.Distributor;

import java.util.ArrayList;
import java.util.List;

public class DistributorService {

    private Distributor distributor;
    private String sessionKey;
    List<Distributor> distributorList = new ArrayList<>();

    public void addDistributor(Distributor distributor){
        distributorList.add(distributor);
    }

    public List<Distributor> getDistributors(){

        return distributorList;
    }

    public DistributorService (){
        distributor = new Distributor("Nelisa", "nelisa.sahula@gmail.com", 24, 30.000, 8.5 );
        sessionKey = "9796";
    }
}
