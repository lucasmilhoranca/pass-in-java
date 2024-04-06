package rocketseat.com.passin.dto.event;

import lombok.Getter;
import lombok.Setter;
import rocketseat.com.passin.domain.event.Event;

@Getter
@Setter
public class EventResponseDTO {
    EventDetailDTO event;

    public EventResponseDTO(Event event, Integer numberOfAttendees) {
        this.event = new EventDetailDTO(
                event.getId(),
                event.getTitle(),
                event.getDetails(),
                event.getSlug(),
                event.getMaximumAttendees(),
                numberOfAttendees
        );
    }
}
