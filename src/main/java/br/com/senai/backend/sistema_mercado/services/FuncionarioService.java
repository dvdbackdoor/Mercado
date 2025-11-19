package br.com.senai.backend.sistema_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Funcionario;
import br.com.senai.backend.sistema_mercado.repositories.FuncionarioRepositorie;




@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepositorie funcionarioRepository;

    
    public Funcionario cadastrar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

        public Funcionario recuperarPorId(Integer id) {
            return funcionarioRepository.findById(id).get();
    }

    public List<Funcionario> listarTodos(){
            return funcionarioRepository.findAll();
    }

    public Funcionario atualizar(Integer id, Funcionario funcionario){
        Funcionario func = funcionarioRepository.findById(id).get();
        if( func != null ){
        funcionario.setId(func.getId());
        return funcionarioRepository.save(funcionario);
        }
        return null;
    }

    public boolean removerPorId(Integer id){
        Funcionario func = funcionarioRepository.findById(id).get();
        if(func != null){
            funcionarioRepository.deleteById(id);
            return true;
        }
            return false;
    } 

    
    



}
