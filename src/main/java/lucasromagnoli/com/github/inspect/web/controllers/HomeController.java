package lucasromagnoli.com.github.inspect.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import lucasromagnoli.com.github.inspect.domain.dto.UsuarioGithubDto;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home/index");
		return mv;
	}
	
	@GetMapping("/buscar-usuario")
	public ModelAndView buscarUsuario(String username) {
		RestTemplate restTemplate = new RestTemplate();
		
		ModelAndView mv = new ModelAndView("home/index");
		
		UsuarioGithubDto usuarioGithubDto = restTemplate.getForObject(UsuarioGithubDto.baseUrl + "users/" + username, UsuarioGithubDto.class);
		ResponseEntity<String> response = restTemplate.getForEntity(UsuarioGithubDto.baseUrl + "users/" + username, String.class);
		mv.addObject("usuarioGithubDto", usuarioGithubDto);
		
		return mv;
	}
}
