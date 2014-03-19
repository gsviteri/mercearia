function validateForm()
{
var x=document.forms["AdicionandoCliente"]["nome"].value;
if (x==null || x=="")
  {
  alert("First name must be filled out");
  return false;
  }
}