package com.msquare.news4you.controller;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class ViewResolver extends UrlBasedViewResolver {
	
	@Override
	protected AbstractUrlBasedView buildView(String viewName) throws Exception {
		return super.buildView(viewName);
	}
}
