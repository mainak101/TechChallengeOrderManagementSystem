<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>OMS</title>
   </head>

   <body>
      <h2>Order Delivery Information</h2>
      <form:form method = "POST" action = "/HelloWeb/addStudent">
         <table>
            <tr>
               <td><form:label path = "location">Location</form:label></td>
               <td><form:input path = "location" /></td>
            </tr>
            <tr>
               <td><form:label path = "sku">SKU</form:label></td>
               <td><form:input path = "sku" /></td>
            </tr>
            <tr>
               <td><form:label path = "amount">Amount</form:label></td>
               <td><form:input path = "amount" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Enter Stock"/>
               </td>
               <td colspan = "2">
                  <input type = "submit" value = "Finish"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>