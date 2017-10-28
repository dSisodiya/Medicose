<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<header>

	<div class="cbtn-1">
		<a href="contactus.html#feedback"><img
			src="${contextRoot}/webResources/images/send-enq.png" alt="" /></a>
	</div>

	<div class="cbtn-2">
		<a href="#" class="newslet"><img
			src="${contextRoot}/webResources/images/news.png" alt="" /></a>
	</div>

	<!--<div class="cbtn-3"><a href="../call-me.htm" class="call"><img src="../webResources/images/cm.png" alt="" /></a></div>-->

	<div class="cbtn-4">
		<!-- ++++++++++++Chat Server Code ++++++++++++++++++++++++++++++-->
		<!-- <script type="text/javascript">
			
				var Comm100API = Comm100API || new Object;
			
				Comm100API.chat_buttons = Comm100API.chat_buttons || [];
			
				var comm100_chatButton = new Object;
			
				comm100_chatButton.code_plan = 407;
			
				comm100_chatButton.div_id = 'comm100-button-407';
			
				Comm100API.chat_buttons.push(comm100_chatButton);
			
				Comm100API.site_id = 187902;
			
				Comm100API.main_code_plan = 407;
			
				var comm100_lc = document.createElement('script');
			
				comm100_lc.type = 'text/javascript';
			
				comm100_lc.async = true;
			
				comm100_lc.src = 'https://chatserver.comm100.com/livechat.ashx?siteId=' + Comm100API.site_id;
			
				var comm100_s = document.getElementsByTagName('script')[0];
			
				comm100_s.parentNode.insertBefore(comm100_lc, comm100_s);
			</script> -->

	</div>

	<!--top section-->

	<div class="top-line">

		<div class="wrapper">

			<div>

				<!--<p class="welcome">Welcome <a href="../login.htm" title="Guest, Sign In"><span class="blues">Guest, Sign In</span></a>, News User <a href="../register.htm" title="Register Here"><span class="blues">Register Here</span></a></p>-->

				<p class="tolfree">
					Call us at: <span class="b">+13152151582</span> | <span
						class="white">Email Id: <a href="#" class="white">info@ddmedsdeal.com</a></span><span
						class="blues break"> <span class="hide">|</span> <a
						href="${contextRoot}/en/index" title="Home">Home</a> | <a
						href="${contextRoot}/aboutUs" title="About Us">About Us</a> | <a
						href="${contextRoot}/contactUs" title="Contact Us">Contact Us</a></span>
				</p>

				<p class="cb"></p>

			</div>

		</div>

	</div>

	<!--top section-->



	<!--logo and search section-->

	<div class="search">

		<div class="wrapper">

			<div>

				<p class="logo">
					<a href="${contextRoot}/home" title="allmedsdeal"><img
						src="${contextRoot}/webResources/images/logo.png"
						alt="allmedsdeal" title="allmedsdeal"></a>
				</p>

				<div class="top-search">

					<div class="search_shape-r show-hide">
						<a href="#"><img
							src="${contextRoot}/webResources/images/search-icon.jpg" alt=""
							title=""></a>
					</div>



					<div class="search_shape">

						<form action="#" method="post">

							<p class="keyword bdrr">
								<input name="txtSearch" type="text" placeholder="Enter Keyword"
									class="sear_h">
							</p>

							<p class="keyword bdrr">
<sf:form modelAttribute="genricPage" action="" id="formDDgenric">

								<sf:select path="Genric_Name" class="sear_h sear_l"
									style="width: 133px !important;" name="generic_name"
									onchange="this.form.submit()">
									<%-- <sf:options items="${countryList}" --%>
									 <sf:option value="-1" label="Genric" />
									 <sf:options items="${genricList}" itemValue="genric_id" itemLabel="genric_Name" />
									 
										 
								</sf:select>
</sf:form>



							</p>

							<p class="keyword bdrr">

<!-- Drop Down List for USB Brand Start -->
								<sf:form modelAttribute="USBrandPage" action="" id="formDDbrand">
									<sf:select path="USB_name" class="sear_h sear_l"
										style="width: 133px !important;" name="generic_name"
										onchange="this.form.submit()">
										<sf:option value="-1" label="US Brand" />
										<sf:options items="${USBList}" itemValue="USB_id"
											itemLabel="USB_name" />
									</sf:select>
								</sf:form>
<!-- Drop Down List for USB Brand end -->	
								<!-- <select name="brand_name" class="sear_h sear_l"
									style="width: 105px !important;" onchange="this.form.submit()">

									<option value="">US Brand</option>

									<option value="Zyvox ">Zyvox</option>
								</select> -->

							</p>

							<p class="search-btn">

								<input name="" type="image"
									src="${contextRoot}/webResources/images/search-icon.jpg">

							</p>

						</form>

					</div>



					<div class="verfied">
						<a href="#/shopcart.php"><img
							src="${contextRoot}/webResources/images/cart_icon.jpg" alt=""
							title="" class="vam mr10">0</a> item, in your cart
					</div>

					<!--<p class="adv"><a href="../advanced-search.htm" class="adv-ser">Advanced Search</a></p>-->

				</div>

				<p class="cb"></p>

			</div>

		</div>

	</div>

	<!--logo and search section-->



	<!--nav-->

	<div class="nav">

		<div class="wrapper">

			<nav class="mobile-tab">

				<div class="nav_mob">
					<a href="javascript:void(0)" class="navlink"><img
						src="${contextRoot}/webResources/images/mobi_nav.png" alt=""
						class="mt8 ml5 mr13 fl">Navigation</a>

					<div class="cb"></div>

					<ul class="topmenu">

						<li><a href="${contextRoot}/en/home" class="act" title="Home">Home</a></li>

						<!--<li><a href="../register.htm" title="Register">Register</a></li>            

                <li><a href="../login.htm" title="Login">login</a></li> -->

						<li><a href="${contextRoot}/category" title="Our products">our
								products</a></li>

						<li><a href="${contextRoot}/contactUs" title="Contact us">contact
								us</a></li>

						<li><a href="./#" title="Order status">order status</a></li>

						<li><a href="${contextRoot}/home" title="Testimonials">Terms
								and Conditions</a></li>

						<li><a href="#" title="Sitemap">sitemap </a></li>

					</ul>

					<p class="cb"></p>

				</div>
				<p class="cb"></p>

			</nav>
			<p class="cb"></p>

		</div>

		<p class="cb"></p>

	</div>

	<!--nav end-->
<!-- new admin navigation start -->
<div class="nav">

		<div class="wrapper">

			<nav class="mobile-tab">

				<div class="nav_mob">
					<a href="javascript:void(0)" class="navlink"><img
						src="${contextRoot}/webResources/images/mobi_nav.png" alt=""
						class="mt8 ml5 mr13 fl">Navigation</a>

					<div class="cb"></div>

					<ul class="topmenu">

						<li><a href="${contextRoot}/en/home" class="act" title="Home">Home</a></li>

						<!--<li><a href="../register.htm" title="Register">Register</a></li>            

                <li><a href="../login.htm" title="Login">login</a></li> -->

						<li><a href="${contextRoot}/category" title="Our products">our
								products</a></li>

						<li><a href="${contextRoot}/contactUs" title="Contact us">contact
								us</a></li>

						<li><a href="./#" title="Order status">order status</a></li>

						<li><a href="${contextRoot}/home" title="Testimonials">Terms
								and Conditions</a></li>

						<li><a href="#" title="Sitemap">sitemap </a></li>

					</ul>

					<p class="cb"></p>

				</div>
				<p class="cb"></p>

			</nav>
			<p class="cb"></p>

		</div>

		<p class="cb"></p>

	</div>

<!-- new admin navigation end -->
</header>
<!-- #EndLibraryItem -->


<div class="wrappers bg-gray">

	<div class="wrapper">

		<div class="marquee">

			<div>

				<span><b>WE Accept Visa and Master Cards.Please email us
						for any query. We do not ship any controlled Medicines .</b></span> <span><b>WE
						Accept Visa and Master Cards.Please email us for any query. We do
						not ship any controlled Medicines.</b></span>

			</div>

		</div>

	</div>

</div>
