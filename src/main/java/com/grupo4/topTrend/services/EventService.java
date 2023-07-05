package com.grupo4.topTrend.services;

import java.util.UUID;

import org.springframework.data.domain.Pageable;

import com.grupo4.topTrend.models.dtos.ShowEventDTO;
import com.grupo4.topTrend.models.dtos.showEventCardDTO;
import com.grupo4.topTrend.models.dtos.PageDTO;
import com.grupo4.topTrend.models.dtos.SaveEventDTO;
import com.grupo4.topTrend.models.entities.Category;
import com.grupo4.topTrend.models.entities.Event;
import com.grupo4.topTrend.models.entities.User;

public interface EventService {
	
	Event save(SaveEventDTO saveInfo, User user, Category category) throws Exception;
	
	ShowEventDTO showEvent(UUID eventCode);
	//Event findByLocationCode(UUID locationCode);
	PageDTO<Event> findAll(Pageable pageable);
	PageDTO<showEventCardDTO> findNextsByTitle(String title, Pageable pageable);
	PageDTO<showEventCardDTO> findPrevsByTitle(String title, Pageable pageable);
	PageDTO<showEventCardDTO> findByUserAndTitle(String identifier, String title, Pageable pageable);
	Boolean existByCode(UUID eventCode);
	Boolean isOwnedBy(UUID eventCode, UUID userCode);
	Event findBycode(UUID code);
	Boolean toggleActive(UUID code);

}
