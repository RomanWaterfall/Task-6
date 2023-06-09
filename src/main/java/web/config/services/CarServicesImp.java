package web.config.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServicesImp implements CarServices {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCarList(count);
    }
}
