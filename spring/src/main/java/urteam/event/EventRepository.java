package urteam.event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import urteam.sport.Sport;


public interface EventRepository extends JpaRepository<Event, Long>{
	
	List<Event> findFirst3BySport(String sport);
	List<Event> findBySport(Sport sport);
	List<Event> findByName(String name);
	List<Event> findByNameIgnoreCase(String name);
	
	@Query("Select c from Event c where c.name like %?1%")
	List<Event> findByNameContaining(String cirteria);
	
	
}

