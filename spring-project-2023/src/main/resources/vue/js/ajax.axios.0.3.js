function get_url(url) {
	var date = new Date();
	var str = 'time=' + date.getTime();
	
	if(url.indexOf('?') > -1)
		return url + '&' + str;
	else
		return url + '?' + str;
}
function block_func(block) {
	if(block)
        $.blockUI({ 
        	message: '<img src="../images/ajax-loader.gif"/>', 
        	css: { 
        		width: '220px', 
        		position: 'absolute', 
        		left: '45%', 
        		top: '45%', 
        		border: '0' 
        	} 
        });
}
function ok_func(response, func, block) {
	func(response);
	if(block)
        $.unblockUI();
}
function error_func(err, block) {
	pushMessage('alert', 'Warning|' + err);
	if(block)
        $.unblockUI();
}

function ajax_func_get(ajaxurl, json, func, block1, block2) {
	if(typeof block2 === 'undefined')
		block2 = block1;
	block_func(block1);
    axios.get(get_url(ajaxurl), json)
        .then(function (response) {
        	ok_func(response, func, block2);
        })
        .catch(function (err) {
        	error_func(err, block1);
        });
}
function ajax_func_post(ajaxurl, json, func, block1, block2) {
	if(typeof block2 === 'undefined')
		block2 = block1;
	block_func(block1);
    axios.post(ajaxurl, json)
        .then(function (response) {
        	ok_func(response, func, block2);
        })
        .catch(function (err) {
        	error_func(err, block1);
        });
}
function ajax_submit(obj, ajaxurl, func, block1, block2) {
	if(typeof block2 === 'undefined')
		block2 = block1;
	block_func(block1);
	obj.ajaxSubmit({
		type: 'post',
		url: ajaxurl, 
		success: function (response) {
        	ok_func(response, func, block2);
        },
		error: function (err) {
        	error_func(err, block1);
        }
	});
}
function trimstring(str) {
    if (str.trim)
        return str.trim();
    else
        return str.replace(/(^\s*)|(\s*$)/g, "");
}