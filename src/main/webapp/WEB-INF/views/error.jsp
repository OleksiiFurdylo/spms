<%@include file="header.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-sm-12">
			<h1>${httpStatus} - ${message}</h1>
			<p>
				${descrioption}
			</p>
			<p>
				<a href="<%=request.getContextPath()%>/"><--- back to main page</a>
			</p>
		</div>
	</div>
</div>
<%@include file="footer.jsp"%>