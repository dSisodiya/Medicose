<spring:url value="/webResources/images/banner_images/banner_21_08_2015_07_09_13.jpg" var="imgBanner1" />
	
	
	<!--banner-->
	<div class="banner">
		<div class="fluid_container">
			<div class="fluid_dg_wrap fluid_dg_charcoal_skin fluid_container"
				id="fluid_dg_wrap_1">
				<div
					data-src="${imgBanner1}" }>
				</div>
				<div
					data-src="${contextRoot}/webResources/images/banner_images/banner_17_08_2016_21_40_50.jpg">
				</div>
			</div>
		</div>
	</div>
	<!--banner end-->


	<!--banner end-->




	<section >

		<div class="wrapper products-btm">



			<div class="categories">

				<p class="cat-tab">Categories</p>

				<p class="cat-tab-r show-hide">
					<a href="javascript:void(0)">Categories</a>
				</p>

				<div class="cate-dis">


					<ul class="cate">

						<li><a href='men-health-pills.html' class='whitelinks'
							title='Men Health Pills'>Men Health Pills </a></li>
						
					</ul>


				</div>

				<div class="cb"></div>




				<div class="test-monial-left mt10">

					<strong>Testimonials</strong><br> Fast delivery and great
					service to USA. This is my third order in three years from
					allmedsdeal. Thanks so much!<br>
					<br> <strong>Tracy Markley</strong>

					<div class="cb"></div>

					<a href="testimonials.html" title="" class="mt10">Click Here to
						view all testimonials</a>

					<div class="cb"></div>

				</div>




			</div>

			<!--featured products-->

			<div class="featured_project">

				<div>
					<p class="cat-tab">
						Featured Products
						<!--<span class="bg-green radius-10 fs13 ttu white"><a href="featued-product.htm" title="More">More</a></span>-->
					</p>

					<p class="cat-tab-r show-hide">
						<a href="javascript:void(0)">Featured Products</a>
					</p>

					<div class="cate-dis">

						<div class="feat-pro">
						<c:forEach begin="1" end="12" var="i">
							<div class="product_area" ng-app="myApp" >

								<div class="pro-w" ng-controller="theController">


									<!-- <div ng-controller="theController" class="pro-cnt"> -->

										<p class="fs15 blue">
											<a href="Apcalis-tadalafil-jelly.html"
												title="Apcalis Oral Jelly">Apcalis Oral Jelly</a>
										</p>

										<p class="fs12 weight300 gray3 lht-16 pt8 h30">

											Manufactured by: Ajanta<br> US Brand: Cialis

										</p>

										<p class="weight700">Tadalafil</p>

										<p class="weight700 green fs15 mt5"></p>

										<p class="btn1 mt15">
											<button ng-click="ProductList()">Click Here</button>
										</p>

									</div>

								<!-- </div> -->

							</div>


						</c:forEach>

						</div>

					</div>
				</div>

			</div>

			<!--featured products end-->

			<div class="cb"></div>

			<!--    <div class = "mt10 ac"><img src = "images/6.jpg" class="img_responsive" alt = ""></div>-->

			<!--hot products-->
			<!--hot products end-->

			<p class="cb"></p>



		</div>

		<!--welcome-->

		<div class="welcomes">

			<div class="wrapper">

				<h1 class="ac">Online Pharmacy Store USA</h1>

				<div class="ac mt30 pl15 pr15">
					Buying prescribed medicines poses plenty of risks. There is a large
					scope for malpractice and misuse in this field. Moreover, if the
					medicines are consumed without the periodical supervision of
					doctors, it could lead to side-effects. These are the main reasons
					for today a large number of people are choosing <b>Online
						Pharmacy Stores in India</b> or <b>Online pharmacy stores in USA</b>,
					over traditional market stores. Providing you with the cheap and
					reliable prescription medicines and generic drugs online,
					AllMedsDeal.com is deeply committed towards the community. <br />
					<br /> AllMedsDeal.com is one of those <b>best online chemists</b>
					whose motto is to simplify your search for medicines and generic
					drugs online. You can either search by Brand-Name or generic name
					when you decide on buying medicine online.
				</div>

			</div>

		</div>

		<!--welcome end-->



		<!--newsletter-->

		<form action="#" method="post">

			<div class="wrapper newsletter">


				<p class="subscribe show-hide">
					<a href="javascript:void(0)">Subscribe Newsletter <img
						src="${contextRoot}/webResources/images/newsletter-icon.png"
						alt="" title="" class="vam"></a>
				</p>

				<div class="news-dis">

					<p class="fs26 gray fl lh35px new-h">Newsletter</p>

					<p class="newsletter_fields field-1">
						<input name="fname" type="text" placeholder="Your Name">
					</p>

					<p class="newsletter_fields field-2">
						<input name="email" type="text" placeholder="Your E-mail ID">
					</p>

					<!--      <div class = "newsletter_fields field-3"><p class = "fl bdrr w56"><input name = "" type = "text" placeholder = "Write the Code" style = "border-right:1px #7e7c7c solid;"></p><p class = "fl pt5 pl15"><img src = "images/captcha.jpg" width = "57" height = "16" alt = ""></p>

        </div>-->

					<input name="input" type="submit" value="Subscribe"
						class="btn3 tab-btn ml10" style="margin-top: -3px;">

					<!--<input name = "input" type = "button" value = "Unsubscribe" class = "btn2"> -->

					<p class="cb"></p>

				</div>

			</div>
			<!-- Script Section -->
<script >
var app=angular.module('myApp',[]);
app.controller('theController',["$scope","$window","$http",function($scope,$window,$http){
	$scope.ProductList=function(){
		$window.alert("Succefully tested");
	}
	$http({
		url:"http://localhost:8080/Medicose/en/ctlCat/readAll",
		method:"get",
		params:{}
	}).then(function(result){$window.alert("Succefull : "+result.status+" , Data is"+result.data)},
			function(result){$window.alert("Failure")});
	
}]);
</script>
		</form>

		<!--newsletter end-->

	</section>