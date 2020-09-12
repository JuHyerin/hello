package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> { //<Model, 속성 id의 타입>
	List<Customer> findByAge(int age);
}