package ok.backend.schedule.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ok.backend.schedule.domain.entity.Schedule;
import ok.backend.schedule.domain.enums.Status;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleResponseDto {
    private Long id;
    private Long userId;
    private String title;
    private String description;
    private Status status;
    private String startDate;
    private String endDate;
    private Integer importance;
    private String createAt;
    private String updateAt;
    private Boolean startNotification;
    private Boolean endNotification;
    private Integer progress;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.userId = schedule.getMember().getId();
        this.title = schedule.getTitle();
        this.description = schedule.getDescription();
        this.status = schedule.getStatus();
        this.startDate = schedule.getStartDate().toString();
        this.endDate = schedule.getEndDate().toString();
        this.importance = schedule.getImportance();
        this.createAt = schedule.getCreateAt().toString();
        this.updateAt = schedule.getUpdateAt().toString();
        this.startNotification = schedule.getStartNotification();
        this.endNotification = schedule.getEndNotification();
        this.progress = schedule.getProgress();
    }
}