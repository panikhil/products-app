(this["webpackJsonpreact-demo"]=this["webpackJsonpreact-demo"]||[]).push([[0],{41:function(e,t,n){"use strict";n.r(t);var c=n(2),a=n.n(c),r=n(16),s=n.n(r),i=n(3),o=n(4),d=n(6),j=n(5),l=n(17),u=n.n(l).a.create({baseURL:"http://localhost:8080/"}),h=n(0),v=function(e){Object(d.a)(n,e);var t=Object(j.a)(n);function n(){return Object(i.a)(this,n),t.apply(this,arguments)}return Object(o.a)(n,[{key:"render",value:function(){var e=this.props.reviewInfo;return Object(h.jsx)("div",{className:"ui cards",children:Object(h.jsx)("div",{className:"card",children:Object(h.jsxs)("div",{className:"content",children:[Object(h.jsx)("div",{className:"header",children:e.reviewer}),Object(h.jsx)("div",{className:"meta",children:"customer"}),Object(h.jsx)("div",{className:"description",children:e.reviewText}),Object(h.jsxs)("div",{className:"description",children:["Rating: ",e.rating]})]})})})}}]),n}(a.a.Component),b=function(e){Object(d.a)(n,e);var t=Object(j.a)(n);function n(){var e;Object(i.a)(this,n);for(var c=arguments.length,a=new Array(c),r=0;r<c;r++)a[r]=arguments[r];return(e=t.call.apply(t,[this].concat(a))).state={reviews:[]},e.showReviews=function(){u.get("/products/"+e.props.prod.id+"/reviews").then((function(t){console.log(t),e.setState({reviews:t.data})}))},e}return Object(o.a)(n,[{key:"render",value:function(){var e=this.props.prod;return Object(h.jsx)("div",{children:Object(h.jsxs)("div",{className:"ui card",children:[Object(h.jsx)("div",{className:"content",children:Object(h.jsx)("a",{className:"header",children:e.name})}),Object(h.jsx)("div",{className:"extra content",children:Object(h.jsx)("a",{children:e.price})}),Object(h.jsx)("div",{className:"extra content",children:Object(h.jsx)("a",{children:e.qoh})}),Object(h.jsx)("div",{className:"extra content",children:Object(h.jsx)("button",{className:"ui button",onClick:this.showReviews,children:"Show Reviews"})}),Object(h.jsx)("div",{className:"extra content",children:this.state.reviews.map((function(e){return Object(h.jsx)(v,{reviewInfo:e},e.id)}))})]})})}}]),n}(a.a.Component),p=function(e){Object(d.a)(n,e);var t=Object(j.a)(n);function n(){var e;Object(i.a)(this,n);for(var c=arguments.length,a=new Array(c),r=0;r<c;r++)a[r]=arguments[r];return(e=t.call.apply(t,[this].concat(a))).state={data:[{id:1,name:"brinta"},{id:2,name:"Rakuten"},{id:3,name:"Walter"},{id:4,name:"Kevin"},{id:5,name:"Jesse"}],products:[]},e}return Object(o.a)(n,[{key:"componentDidMount",value:function(){var e=this;u.get("/products").then((function(t){console.log(t),e.setState({products:t.data})}))}},{key:"render",value:function(){return Object(h.jsxs)("div",{className:"ui raised very padded text container segment",children:[Object(h.jsx)("h1",{children:"Rakuten Store"}),this.state.products.map((function(e){return Object(h.jsx)(b,{prod:e},e.id)}))]})}}]),n}(a.a.Component);s.a.render(Object(h.jsx)(p,{}),document.getElementById("root"))}},[[41,1,2]]]);
//# sourceMappingURL=main.69ea0caf.chunk.js.map