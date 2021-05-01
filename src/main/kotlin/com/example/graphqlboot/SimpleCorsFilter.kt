package com.example.graphqlboot;

import org.springframework.stereotype.Component
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Component
class SimpleCorsFilter : Filter {

	override fun doFilter(req: ServletRequest, res: ServletResponse, chain: FilterChain) {
		val response = res as HttpServletResponse
		val request = req as HttpServletRequest
		response.setHeader("Access-Control-Allow-Origin", "*")
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT")
		response.setHeader("Access-Control-Max-Age", "12000")
		response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With")
		response.setHeader("Access-Control-Expose-Headers", "*")
		if ("OPTIONS".equals(request.method, ignoreCase = true)) {
			response.status = HttpServletResponse.SC_OK
		} else {
			chain.doFilter(req, res)
		}
	}

}