
$(document).ready(function() {
        $(" #button").click(function(){
           var string=$("form").serialize();
           var svalue=$("#svalue").val();
            var error=1;
            var num;

        if(svalue=="TEST_1"||svalue=="TEST_2")
     	   {
     	      num=20
     	   
     	   }
        if(svalue=="END_SEM")
     	   {
     	  
   	    	num=40;
     	   
     	   }
        if(svalue=="ATTENDENCE"||svalue=="ASSIGNMENT")
     	   {
     	     num=5;
     	   }
        if(svalue=="QUIZ")
     	   {
     	   
     	   num=10;
     	   }
            
            var x = $("form").serializeArray();
            $.each(x, function(i, field){
         	   if(field.value< 0 || field.value >num)
         		   {
         		  error=0;
         		   }
         		   
            });
               
           if(error==1)
        	   {
       $.ajax({
        		
        		type:'POST',
        	    url:'AddMarks',
        	    data:{string:string,svalue:svalue},
        	    success:function()
        	    {
        	    	alert('Updated sucessfully');
        	    }
        	}); 
        	   }
           else if(error==0)
        	   {
        	   alert("Enter Valid Marks");
        	   }
        	
        });
});