function validateForm()
{
	var password = document.forms["form1"]["password"].value;
	var confirmPassword = document.forms["form1"]["confirmPassword"].value;
	var accountType = document.forms["form1"]["accountType"].value;
	var balance = document.forms["form1"]["balance"].value;
	if(password != confirmPassword)
	{
		alert("Passwords must match");
		return false;
	}
	else if(accountType.trim() == "Savings")
	{
		if(balance < 200)
		{
			alert("Savings balance must be $200 or greater.");
			return false;
		}
	}
	else if(accountType.trim() == "Checking")
	{
		if(balance < 300)
		{
			alert("Checking balance must be $300 or greater.");
			return false;
		}
	}
	else if(accountType.trim() == "Cd")
	{
		if(balance < 2000)
		{
			alert("CD balance must be $2000 or greater.");
			return false;
		}
	}
}

function validateAmount()
{
	var action = document.forms["form2"]["action"].value;
	if(action.trim() == "Withdraw")
	{
		var accountType = document.forms["form2"]["accountType"].value;
		var amount = document.forms["form2"]["amount"].value;
		if(accountType.trim() == "Savings")
		{
			if(amount > balanceS)
			{
				alert("Can not withdraw more than available balance.");
				return false;
			}
		}
			else if(accountType.trim() == "Checking")
			{
				if(amount > balanceC)
				{
					alert("Can not withdraw more than available balance.");
					return false;
				}
			}
			else if(accountType.trim() == "Cd")
			{
				if(amount > balanceCD)
				{
					alert("Can not withdraw more than available balance.");
					return false;
				}
			}
	}
}