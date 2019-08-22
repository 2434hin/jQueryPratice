/**
 *
 */
var writeServer = function () {
	$.ajax({
		url : '/jqpro/BoardWrite',
		type : 'post',
		data : $('#writeForm').serializeArray(),
		dataType : 'json',
		success : function(datas) {
			$('#myModal').modal('hide');
			readServer();
		},
		error : function (xhr) {
			alert("상태 : " + xhr.status);
		}
	})
}

var readServer = function(){
	$.ajax({
		url : '/jqpro/BoardList',
		type : 'get',
		dataType : 'json',
		success : function (datas) {
			code = '<div class="panel-group" id="parent">';

			$.each(datas, function (i, v) {
				code += '<div class="panel panel-default">                                                                                                 '                      ;
					code += '      <div class="panel-heading">                                                                                                 '                  ;
					code += '        <h4 class="panel-title">                                                                                                  '                  ;
					code += '          <a data-toggle="collapse" data-parent="#accordion" href="#collapse' + v.seq + '">' + v.subject +'</a>                            '         ;
					code += '        </h4>                                                                                                                     '                  ;
					code += '      </div>                                                                                                                      '                  ;
					code += '      <div id="collapse' + v.seq + '" class="panel-collapse collapse">                                                                     '      ;
					code += '        <div class="panel-body">                                                                                                  '                  ;
					code += '        	<p style="width: 80%; float: left;">                                                                                   '                  ;
					code += '	     	        작성자 :' + v.writer + '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                         '  ;
					code += '	    	        이메일 :' + v.mail + '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                         '    ;
					code += '	    	        작성일 :' + v.day + '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                         '     ;
					code += '	    	        조회수 :' + v.hit + '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                                                         '     ;
					code += '        	</p>                                                                                                                   '                  ;
					code += '                                                                                                                                  '                  ;
					code += '        	<p style="float: right;">                                                                                              '                  ;
					code += '        		<button idx="' + v.seq + '" type="button" name="modify" class="action">수정</button>                                           '      ;
					code += '        		<button idx="' + v.seq + '" type="button" name="delete" class="action">삭제</button>                                           '      ;
					code += '        	</p>                                                                                                                   '                  ;
					code += '                                                                                                                                  '                  ;
					code += '        	<hr>                                                                                                                   '                  ;
					code += '                                                                                                                                  '                  ;
					code += '        	<p style="width: 80%; float: left;">' + v.cont + '                                                                                   '    ;
					code += '        	</p>                                                                                                                   '                  ;
					code += '                                                                                                                                  '                  ;
					code += '        	<p>                                                                                                                    '                  ;
					code += '        		<textarea class="area" cols="100">댓글쓰기</textarea>                                                              '                  ;
					code += '        		<button style="height: 45px; vertical-align: top;" type="button" idx="' + v.seq + '" name="reply" class="action">등록</button> '      ;
					code += '        	</p>                                                                                                                   '                  ;
					code += '        </div>                                                                                                                    '                  ;
					code += '      </div>                                                                                                                      '                  ;
					code += '    </div>';
			})
			code += "</div>";
			$('#accordionList').html(code);

		},
		error : function (xhr) {
			alert("상태 : " + xhr.status);
		}
	})
}