package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.Dao.ProductDao;
import productcrudapp.Model.Product;
@Controller	
public class MainController {
  
	@Autowired
  private ProductDao pdao;
	
	@RequestMapping("/")
	public String view(Model m) {
		
		List<Product> product = pdao.getAll();
		m.addAttribute("product",product);
		
		return "index";
		
	}
	
	
	
	@RequestMapping("/addProduct")
	public String addProduct(Model m) {
		
		m.addAttribute("title","add product");
		return "add_product_form";
	}
	
	@RequestMapping(value ="/handle-product",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		
		pdao.createProduct(product);
		RedirectView rdview = new RedirectView();
		rdview.setUrl(request.getContextPath()+"/");
		return rdview;	
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int pid,HttpServletRequest request) {
		
		pdao.deleteProduct(pid);
		RedirectView rdview = new RedirectView();
		rdview.setUrl(request.getContextPath()+"/");
		return rdview;
		}
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int pid,Model m) {
	
		Product product = this.pdao.getProduct(pid);
		m.addAttribute("product",product);
		return "/update_form";		
	}
	
	
	
		
	}

	

