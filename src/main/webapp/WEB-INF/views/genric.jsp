<c:set var="addVal" value="Genric" />

<section>

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
		</div>

		<!--featured products-->

		<div class="featured_project">

			<div>
				<div class="feat-pro">

<!-- single form start -->
					<form action="${contextRoot}/en/ctlGenric/Add" method="post">
						<p class="cat-tab">Add Single ${addVal}</p>
						<div class="news-dis">
						<input type="hidden" name="id">
							<p class="newsletter_fields field-1">
								<input name="name" type="text" placeholder="Your Name">
							</p>
							<input name="input" type="submit" value="Save"
								class="btn3 tab-btn ml10" style="margin-top: -3px;">
							<p class="cb"></p>
<div class="cb" style="margin-top: 60px;" >OR</div>

		<p class="cb"></p>
						</div>
					</form>
<!-- single form end Multiple form start -->
					<form action="">
						<p class="cat-tab" style="margin-top: 60px;">Add Multiple ${addVal}</p>
						<div class="news-dis">
							<p class="newsletter_fields field-1">
								<input name="fname" type="text" placeholder="Genric Name1">
							</p>
							<p class="newsletter_fields field-1">
								<input name="fname" type="text" placeholder="Genric Name2">
							</p>
							<p class="newsletter_fields field-1">
								<input name="fname" type="text" placeholder="Genric Name3">
							</p>
							<p class="newsletter_fields field-1">
								<input name="fname" type="text" placeholder="Genric Name4">
							</p>
							<p class="newsletter_fields field-1">
								<input name="fname" type="text" placeholder="Genric Name5">
							</p>
							<input name="input" type="submit" value="Save"
								class="btn3 tab-btn ml10" style="margin-top: -3px;">
						</div>
					</form>

				</div>
			</div>
		</div>

		<!--featured products end-->
<div class="cb"  ></div>

		<p class="cb"></p>
		
	</div>

	<!--welcome-->
	<div class="welcomes">
		<div class="wrapper">
			<h1 class="ac">Online Pharmacy Store USA</h1>		
		</div>
	</div>

	<!--welcome end-->


</section>