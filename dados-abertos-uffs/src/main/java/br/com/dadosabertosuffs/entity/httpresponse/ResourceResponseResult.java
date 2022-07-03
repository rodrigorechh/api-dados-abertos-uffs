package br.com.dadosabertosuffs.entity.httpresponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class ResourceResponseResult {

    @JsonProperty("fields")
    private List<ResourceResponseFieldResult> fields;
    
}