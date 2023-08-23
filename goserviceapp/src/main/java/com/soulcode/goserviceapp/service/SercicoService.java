package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SercicoService {

@Autowired
    private ServicoRepository servricoRepository;

    public List<Servico> findAll(){
        return servricoRepository.findAll();
    }

    public Servico createServico(Servico servico){
        servico.setId(null);
        return servricoRepository.save(servico);
    }

    public void removeServicoById(Long id){
        servricoRepository.deleteById(id);
    }

    public Servico findById(Long id){
        Optional<Servico> servico = servricoRepository.findById(id);
        if (servico.isPresent()){
            return servico.get();
        }else{
            throw new RuntimeException("Serviço não encontrado");
        }
    }

    public Servico update(Servico servico){
        Servico updatedServico = this.findById(servico.getId());
        updatedServico.setNome(servico.getNome());
        updatedServico.setDescricao(servico.getDescricao());
        updatedServico.setCategoria(servico.getCategoria());
        return servricoRepository.save(updatedServico);
    }

}
