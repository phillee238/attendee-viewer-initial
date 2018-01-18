package io.rscale.training.attendeeviewer;

import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class CompanyClientFallback implements CompanyClient {

	@Override
	public Company getCompany(@PathVariable("id") String id) {
		return new Company();
	}

	@Override
	public PagedResources<Company> getCompany() {
		return null;
	}
}
