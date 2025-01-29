package com.badside.shop.usuario.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.badside.shop.usuario.repertorio.*;
import com.badside.usuario.modelo.*;


@RestController
@RequestMapping("/usuario")
public class UserController {
	
	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@GetMapping
	public List<Usuario> getUsuario(){
		return usuarioRepo.findAll();
	}
	
	
	

}
