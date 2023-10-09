package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Car {
	private String id;
	@With
	private String brand;
	private boolean hasTuev;
}
