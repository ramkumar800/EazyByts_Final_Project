package carrentalsystem.services.customer;

import carrentalsystem.dto.BookACarDto;
import carrentalsystem.dto.CarDto;

import java.util.List;

public interface CustomerService {
    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(Long id);

    List<BookACarDto> getBookingsByUserId(Long id);
}
