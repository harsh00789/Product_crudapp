package productcrudapp.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import productcrudapp.Model.Product;

@Component
public class ProductDao {

		@Autowired
		private HibernateTemplate hibernatetemplate;
		
		@Transactional
		public void createProduct(Product p) {
			
			this.hibernatetemplate.saveOrUpdate(p);
			
		}
		
		public List<Product> getAll(){
			List<Product> product = new ArrayList();
			
		product =	hibernatetemplate.loadAll(Product.class);
		
			
		return product;
		
		}
	
		@Transactional
		public void deleteProduct(int pid) {
		Product p =	hibernatetemplate.load(Product.class,pid);
		hibernatetemplate.delete(p);
		
		}
		
		public Product getProduct(int pid) {
			
		return	hibernatetemplate.load(Product.class,pid);
			
		}

}
