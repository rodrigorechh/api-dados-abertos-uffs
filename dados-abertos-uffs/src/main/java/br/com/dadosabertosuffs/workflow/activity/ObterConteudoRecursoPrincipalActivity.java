package br.com.dadosabertosuffs.workflow.activity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import br.com.dadosabertosuffs.entity.httpresponse.ResourceResponse;
import br.com.dadosabertosuffs.workflow.service.ObterResourceService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ObterConteudoRecursoPrincipalActivity {

    @Autowired
    private final ObterResourceService obterResourceService;

    
    public ResourceResponse execute(String idDataset, String filtros) throws JsonProcessingException {    
        String datasetConteudo = obterResourceService.obterRecursoConteudo(idDataset, Optional.ofNullable(filtros));

        return new Gson().fromJson(datasetConteudo, ResourceResponse.class);
    }

}
