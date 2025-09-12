<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!--=============== FLATICON ===============-->
    <link
      rel="stylesheet"
      href="https://cdn-uicons.flaticon.com/2.0.0/uicons-regular-straight/css/uicons-regular-straight.css"
    />

    <!--=============== SWIPER CSS ===============-->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css"
    />

    <!--=============== CSS ===============-->
    <link rel="stylesheet" href="assets/css/styles.css" />

    <title>Ecommerce Website</title>
    
  <<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  
<!--   	<script type="text/javascript">
  		
  			$(document).ready(function(){
  				
  				laodProducts()
  			})
  			
  			const laodProducts = () =>{
  				
  				$.get("getproducts",{},function(rt){
  					alert(rt)
  				})
  				
  			}
  	
  	</script> -->
  
  </head>
  <body>
    <!--=============== HEADER ===============-->
   	<jsp:include page="header.jsp"></jsp:include>
    <!--=============== MAIN ===============-->
    <main class="main">
      <!--=============== HOME ===============-->
      <section class="home section--lg">
        <div class="home__container container grid">
          <div class="home__content">
            <span class="home__subtitle">Hot Promotions</span>
            <h1 class="home__title">
              Fashion Trending <span>Great Collection</span>
            </h1>
            <p class="home__description">
              Save more with coupons & up tp 20% off
            </p>
            <a href="shop.html" class="btn">Shop Now</a>
          </div>
          <img src="assets/img/home-img.png" class="home__img" alt="hats" />
        </div>
      </section>

      <!--=============== CATEGORIES ===============-->
   <section class="categories container section">
  <h3 class="section__title"><span>Popular</span> Categories</h3>
  <div class="categories__container">
    <div class="swiper-wrapper">

      <!-- Force ALL category as first -->
      <a href="?catid=0" class="category__item swiper-slide">
        <img src="../category_img/all.png" alt="All" class="category__img"/>
        <h3 class="category__title">ALL</h3>
      </a>

      <!-- Other categories from DB -->
      <c:forEach var="dt" items="${categories}">
        <c:if test="${dt.getName() ne 'ALL'}">
          <a href="?catid=${dt.getId()}" class="category__item swiper-slide">
            <img src="../category_img/${dt.getImage()}" alt="${dt.getName()}" class="category__img"/>
            <h3 class="category__title">${dt.getName()}</h3>
          </a>
        </c:if>
      </c:forEach>

    </div>

    <div class="swiper-button-prev">
      <i class="fi fi-rs-angle-left"></i>
    </div>
    <div class="swiper-button-next">
      <i class="fi fi-rs-angle-right"></i>
    </div>
  </div>
</section>



      <!--=============== PRODUCTS ===============-->
      <section class="products container section">
       

        <div class="tab__items">
          <div class="tab__item active-tab" content id="featured">
            <div class="products__container grid">
             <c:forEach var="dt" items="${products}">
              <div class="product__item">
                <div class="product__banner">
                  <a href="details.html" class="product__images">
                    <img
                      src="product_img/${dt.getImage()}"
                      alt=""
                      class="product__img default"
                    />
                    
                  </a>
                  <div class="product__actions">
                    <a href="#" class="action__btn" aria-label="Quick View">
                      <i class="fi fi-rs-eye"></i>
                    </a>
                    <a
                      href="#"
                      class="action__btn"
                      aria-label="Add to Wishlist"
                    >
                      <i class="fi fi-rs-heart"></i>
                    </a>
                    <a href="#" class="action__btn" aria-label="Compare">
                      <i class="fi fi-rs-shuffle"></i>
                    </a>
                  </div>
                 
                </div>
                <div class="product__content">
                  <span class="product__category">${dt.getCategory().getName() }</span>
                  <a href="details.html">
                    <h3 class="product__title">${dt.getName() }</h3>
                  </a>
                  <div class="product__rating">
                    <i class="fi fi-rs-star"></i>
                    <i class="fi fi-rs-star"></i>
                    <i class="fi fi-rs-star"></i>
                    <i class="fi fi-rs-star"></i>
                    <i class="fi fi-rs-star"></i>
                  </div>
                  <div class="product__price flex">
                    <span class="new__price">Rs. ${dt.getPrice()}</span>
                
                  </div>
                  <a
                    href="#"
                    class="action__btn cart__btn"
                    aria-label="Add To Cart"
                  >
                    <i class="fi fi-rs-shopping-bag-add"></i>
                  </a>
                </div>
              </div>
           	</c:forEach>     
            </div>
          </div>
      </div>
      </section>

      <!--=============== DEALS ===============-->
      <section class="deals section">
        <div class="deals__container container grid">
          <div class="deals__item">
            <div class="deals__group">
              <h3 class="deals__brand">Deals of the Day</h3>
              <span class="deals__category">Limited quantities</span>
            </div>
            <h4 class="deals__title">Summer Collection New Modern Design</h4>
            <div class="deals__price flex">
              <span class="new__price">$139.00</span>
              <span class="old__price">$160.99</span>
            </div>
            <div class="deals__group">
              <p class="deals__countdown-text">Hurry Up! Offer Ends In:</p>
              <div class="countdown">
                <div class="countdown__amount">
                  <p class="countdown__period">02</p>
                  <span class="unit">Days</span>
                </div>
                <div class="countdown__amount">
                  <p class="countdown__period">22</p>
                  <span class="unit">Hours</span>
                </div>
                <div class="countdown__amount">
                  <p class="countdown__period">57</p>
                  <span class="unit">Mins</span>
                </div>
                <div class="countdown__amount">
                  <p class="countdown__period">28</p>
                  <span class="unit">Sec</span>
                </div>
              </div>
            </div>
            <div class="deals__btn">
              <a href="details.html" class="btn btn--md">Shop Now</a>
            </div>
          </div>
          <div class="deals__item">
            <div class="deals__group">
              <h3 class="deals__brand">Women Clothing</h3>
              <span class="deals__category">Shirts & Bag</span>
            </div>
            <h4 class="deals__title">Try Something new on vacation</h4>
            <div class="deals__price flex">
              <span class="new__price">$178.00</span>
              <span class="old__price">$256.99</span>
            </div>
            <div class="deals__group">
              <p class="deals__countdown-text">Hurry Up! Offer Ends In:</p>
              <div class="countdown">
                <div class="countdown__amount">
                  <p class="countdown__period">02</p>
                  <span class="unit">Days</span>
                </div>
                <div class="countdown__amount">
                  <p class="countdown__period">22</p>
                  <span class="unit">Hours</span>
                </div>
                <div class="countdown__amount">
                  <p class="countdown__period">57</p>
                  <span class="unit">Mins</span>
                </div>
                <div class="countdown__amount">
                  <p class="countdown__period">28</p>
                  <span class="unit">Sec</span>
                </div>
              </div>
            </div>
            <div class="deals__btn">
              <a href="details.html" class="btn btn--md">Shop Now</a>
            </div>
          </div>
        </div>
      </section>

      <!--=============== NEW ARRIVALS ===============-->
      <section class="new__arrivals container section">
        <h3 class="section__title"><span>New</span> Arrivals</h3>
        <div class="new__container swiper">
          <div class="swiper-wrapper">
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-1-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-1-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-pink">Hot</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-2-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-2-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-green">Hot</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-3-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-3-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-orange">Hot</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-4-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-4-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-blue">Hot</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-5-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-5-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-blue">-30%</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-6-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-6-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-blue">-22%</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
            <div class="product__item swiper-slide">
              <div class="product__banner">
                <a href="details.html" class="product__images">
                  <img
                    src="assets/img/product-7-1.jpg"
                    alt=""
                    class="product__img default"
                  />
                  <img
                    src="assets/img/product-7-2.jpg"
                    alt=""
                    class="product__img hover"
                  />
                </a>
                <div class="product__actions">
                  <a href="#" class="action__btn" aria-label="Quick View">
                    <i class="fi fi-rs-eye"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Add to Wishlist">
                    <i class="fi fi-rs-heart"></i>
                  </a>
                  <a href="#" class="action__btn" aria-label="Compare">
                    <i class="fi fi-rs-shuffle"></i>
                  </a>
                </div>
                <div class="product__badge light-green">-22%</div>
              </div>
              <div class="product__content">
                <span class="product__category">Clothing</span>
                <a href="details.html">
                  <h3 class="product__title">Colorful Pattern Shirts</h3>
                </a>
                <div class="product__rating">
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                  <i class="fi fi-rs-star"></i>
                </div>
                <div class="product__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
                <a
                  href="#"
                  class="action__btn cart__btn"
                  aria-label="Add To Cart"
                >
                  <i class="fi fi-rs-shopping-bag-add"></i>
                </a>
              </div>
            </div>
          </div>

          <div class="swiper-button-prev">
            <i class="fi fi-rs-angle-left"></i>
          </div>
          <div class="swiper-button-next">
            <i class="fi fi-rs-angle-right"></i>
          </div>
        </div>
      </section>

      <!--=============== SHOWCASE ===============-->
      <section class="showcase section">
        <div class="showcase__container container grid">
          <div class="showcase__wrapper">
            <h3 class="section__title">Hot Releases</h3>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-1.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">
                    Floral Print Casual Cotton Dress
                  </h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-2.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">
                    Ruffled Solid Long Sleeve Blouse
                  </h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-3.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">
                    Multi-Color Print V-neck T-shirt
                  </h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
          </div>
          <div class="showcase__wrapper">
            <h3 class="section__title">Deals & Outlet</h3>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-4.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">Fish Print Patched T-shirt</h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-5.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">Fintage Floral Print Dress</h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-6.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">
                    Multi-Color Stripe Circle T-shirt
                  </h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
          </div>
          <div class="showcase__wrapper">
            <h3 class="section__title">Top Selling</h3>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-7.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">
                    Geometric Printed Long Sleeve Blouse
                  </h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-8.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">Print Patchwork Maxi Dress</h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-9.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">
                    Daisy Floral Print Straps Jumpsuit
                  </h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
          </div>
          <div class="showcase__wrapper">
            <h3 class="section__title">Trendy</h3>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-7.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">Floral Print Casual Cotton</h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-8.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">Ruffled Solid Long Sleeve</h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
            <div class="showcase__item">
              <a href="details.html" class="showcase__img-box">
                <img
                  src="./assets/img/showcase-img-9.jpg"
                  alt=""
                  class="showcase__img"
                />
              </a>
              <div class="showcase__content">
                <a href="details.html">
                  <h4 class="showcase__title">Multi-Color Print V-neck</h4>
                </a>
                <div class="showcase__price flex">
                  <span class="new__price">$238.85</span>
                  <span class="old__price">$245.8</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <!--=============== NEWSLETTER ===============-->
      <section class="newsletter section home__newsletter">
        <div class="newsletter__container container grid">
          <h3 class="newsletter__title flex">
            <img
              src="./assets/img/icon-email.svg"
              alt=""
              class="newsletter__icon"
            />
            Sign in to Newsletter
          </h3>
          <p class="newsletter__description">
            ...and receive $25 coupon for first shopping.
          </p>
          <form action="" class="newsletter__form">
            <input
              type="text"
              placeholder="Enter Your Email"
              class="newsletter__input"
            />
            <button type="submit" class="newsletter__btn">Subscribe</button>
          </form>
        </div>
      </section>
    </main>

    <!--=============== FOOTER ===============-->
    <footer class="footer container">
      <div class="footer__container grid">
        <div class="footer__content">
          <a href="index.html" class="footer__logo">
            <img src="./assets/img/logo.svg" alt="" class="footer__logo-img" />
          </a>
          <h4 class="footer__subtitle">Contact</h4>
          <p class="footer__description">
            <span>Address:</span> 13 Tlemcen Road, Street 32, Beb-Wahren
          </p>
          <p class="footer__description">
            <span>Phone:</span> +01 2222 365 /(+91) 01 2345 6789
          </p>
          <p class="footer__description">
            <span>Hours:</span> 10:00 - 18:00, Mon - Sat
          </p>
          <div class="footer__social">
            <h4 class="footer__subtitle">Follow Me</h4>
            <div class="footer__links flex">
              <a href="#">
                <img
                  src="./assets/img/icon-facebook.svg"
                  alt=""
                  class="footer__social-icon"
                />
              </a>
              <a href="#">
                <img
                  src="./assets/img/icon-twitter.svg"
                  alt=""
                  class="footer__social-icon"
                />
              </a>
              <a href="#">
                <img
                  src="./assets/img/icon-instagram.svg"
                  alt=""
                  class="footer__social-icon"
                />
              </a>
              <a href="#">
                <img
                  src="./assets/img/icon-pinterest.svg"
                  alt=""
                  class="footer__social-icon"
                />
              </a>
              <a href="#">
                <img
                  src="./assets/img/icon-youtube.svg"
                  alt=""
                  class="footer__social-icon"
                />
              </a>
            </div>
          </div>
        </div>
        <div class="footer__content">
          <h3 class="footer__title">Address</h3>
          <ul class="footer__links">
            <li><a href="#" class="footer__link">About Us</a></li>
            <li><a href="#" class="footer__link">Delivery Information</a></li>
            <li><a href="#" class="footer__link">Privacy Policy</a></li>
            <li><a href="#" class="footer__link">Terms & Conditions</a></li>
            <li><a href="#" class="footer__link">Contact Us</a></li>
            <li><a href="#" class="footer__link">Support Center</a></li>
          </ul>
        </div>
        <div class="footer__content">
          <h3 class="footer__title">My Account</h3>
          <ul class="footer__links">
            <li><a href="#" class="footer__link">Sign In</a></li>
            <li><a href="#" class="footer__link">View Cart</a></li>
            <li><a href="#" class="footer__link">My Wishlist</a></li>
            <li><a href="#" class="footer__link">Track My Order</a></li>
            <li><a href="#" class="footer__link">Help</a></li>
            <li><a href="#" class="footer__link">Order</a></li>
          </ul>
        </div>
        <div class="footer__content">
          <h3 class="footer__title">Secured Payed Gateways</h3>
          <img
            src="./assets/img/payment-method.png"
            alt=""
            class="payment__img"
          />
        </div>
      </div>
      <div class="footer__bottom">
        <p class="copyright">&copy; 2024 Evara. All right reserved</p>
        <span class="designer">Designer by Crypticalcoder</span>
      </div>
    </footer>

    <!--=============== SWIPER JS ===============-->
    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>

    <!--=============== MAIN JS ===============-->
    <script src="assets/js/main.js"></script>
  </body>
</html>
