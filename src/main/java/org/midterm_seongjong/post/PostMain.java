package org.midterm_seongjong.post;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
					"post_context.xml");
			PostService postService = context.getBean("postService",
					PostService.class);

			postService.addPost();
			postService.listPosts();
			postService.likePost();
	context.close();

	}

}
