package com.example.myproject.miniproject.dto;

import com.example.myproject.miniproject.entities.Category;
import com.example.myproject.miniproject.entities.Organizer;
import com.example.myproject.miniproject.entities.Topics;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Organizer organizer;
    private String name;
    private String bannerImage;
    private Category category;
    private Topics topics;
}
