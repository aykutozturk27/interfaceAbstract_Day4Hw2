package Entities;

import java.time.LocalDate;
import Abstract.IEntity;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationalityId;
}
