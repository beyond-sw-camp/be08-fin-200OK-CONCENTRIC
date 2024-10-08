package ok.backend.storage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import ok.backend.storage.domain.entity.StorageFile;

import java.time.LocalDateTime;

@Getter
public class StorageResponseDto {

    @JsonProperty
    private Long storageId;

    @JsonProperty
    private Long storageFileId;

    @JsonProperty
    private String originalName;

    @JsonProperty
    private Long size;

    @JsonProperty
    private LocalDateTime createDate;

    public StorageResponseDto(StorageFile storageFile) {
        this.storageId = storageFile.getStorage().getId();
        this.storageFileId = storageFile.getId();
        this.originalName = storageFile.getOriginalName();
        this.size = storageFile.getSize();
        this.createDate = storageFile.getCreateDate();
    }
}
