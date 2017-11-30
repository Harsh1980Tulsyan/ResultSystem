
$(document).ready(function() {
        $(" #button").click(function(){
           var string=$("form").serialize();
           var svalue=$("#svalue").val();
       $.ajax({
        		
        		type:'POST',
        	    url:'AddMarks',
        	    data:{string:string,svalue:svalue},
        	    success:function()
        	    {
        	    	alert('Updated sucessfully');
        	    }
        	});   		
        	
        });
});