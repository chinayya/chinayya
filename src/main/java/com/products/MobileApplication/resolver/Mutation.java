package com.products.MobileApplication.resolver;
import com.products.MobileApplication.model.Mobile;
import com.products.MobileApplication.repository.MobileRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class Mutation implements GraphQLMutationResolver{

    @Autowired
    private MobileRepository mobileRepository;

    public Mobile createMobile(String mobileName, String mobilePrice, String mobileRam, String mobileStorage){
        Mobile mobile = new Mobile();
        mobile.setMobileName(mobileName);
        mobile.setMobilePrice(mobilePrice);
        mobile.setMobileRam(mobileRam);
        mobile.setMobileStorage(mobileStorage);
        return mobileRepository.save(mobile);
    }

    public boolean deleteMobile(Long mobileId){
        mobileRepository.deleteById(mobileId);
        return true;
    }

    public Mobile updateMobile(Long mobileId, String mobileName, String mobilePrice, String mobileRam, String mobileStorage)
    throws EntityNotFoundException {
        Optional<Mobile> optionalMobile = mobileRepository.findById(mobileId);
        if (optionalMobile.isPresent()){
            Mobile mobile = optionalMobile.get();
            mobile.setMobileName(mobileName);
            mobile.setMobilePrice(mobilePrice);
            mobile.setMobileRam(mobileRam);
            mobile.setMobileStorage(mobileStorage);
            mobileRepository.save(mobile);
            return mobile;
        }
        throw new EntityNotFoundException("Not found Mobile to update!");
    }

}
