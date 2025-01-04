package com.ashokit.response;

import java.util.List;

import com.ashokit.dto.PersonDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PageResponse {
	
	private List<PersonDTO> content;
	
	private int pageNumber;
	
	private int pageSize;
	
	private long totalElements;
	
	private long totalPages;
	
	private boolean lastPage;
}