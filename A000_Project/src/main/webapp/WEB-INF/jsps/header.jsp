<%@page import="com.example.demo.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <header class="header">
    

      <nav class="nav container">
        <a href="/" class="nav__logo">
          <img
            class="nav__logo-img"
            src="assets/img/logo.svg"
            alt="website logo"
          />
        </a>
        <div class="nav__menu" id="nav-menu">
          <div class="nav__menu-top">
            <a href="/" class="nav__menu-logo">
              <img src="./assets/img/logo.svg" alt="">
            </a>
            <div class="nav__close" id="nav-close">
              <i class="fi fi-rs-cross-small"></i>
            </div>
          </div>
          <ul class="nav__list">
            <li class="nav__item">
              <a href="/" class="nav__link active-link">Home</a>
            </li>
            <li class="nav__item">
              <a href="shop" class="nav__link">Shop</a>
            </li>
            <li class="nav__item">
              <a href="accounts" class="nav__link">My Account</a>
            </li>
            <li class="nav__item">
              <a href="compare" class="nav__link">Compare</a>
            </li>
            <%
            	User u = (User)session.getAttribute("user");
            	if(u==null)
            	{
            		%>
            		<li class="nav__item">
              <a href="loginregister" class="nav__link">Login</a>
            </li>
            	<%}
            	else
            	{%>
        		<li class="nav__item">
          <a href="userLogout" class="nav__link">Logout</a>
        </li>
        	<%
            		
            	}
            %>
            
          </ul>
          <div class="header__search">
            <input
              type="text"
              placeholder="Search For Items..."
              class="form__input"
            />
            <button class="search__btn">
              <img src="assets/img/search.png" alt="search icon" />
            </button>
          </div>
        </div>
        <div class="header__user-actions">
          <a href="wishlist" class="header__action-btn" title="Wishlist">
            <img src="assets/img/icon-heart.svg" alt="" />
            <span class="count">3</span>
          </a>
          <a href="cart" class="header__action-btn" title="Cart">
            <img src="assets/img/icon-cart.svg" alt="" />
            <span class="count">3</span>
          </a>
          <div class="header__action-btn nav__toggle" id="nav-toggle">
            <img src="./assets//img/menu-burger.svg" alt="">
          </div>
        </div>
      </nav>
    </header>


</body>
</html>