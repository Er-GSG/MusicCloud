<%-- 
    Document   : newjsp
    Created on : Dec 1, 2014, 12:51:47 PM
    Author     : VMM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="example/css/style.css" />
        <link rel="stylesheet" href="example/css/ribbon.css" />
        <script src="wave/wavesurfer.js" >
        </script>
        <script src="./wave/webaudio.js"></script>
        <!--<script src="./wave/audioelement.js"></script>-->
        <script src="./wave/drawer.js"></script>
        <script src="./wave/drawer.canvas.js"></script>
        <script src="example/main.js"></script>
        <script src="example/trivia.js"></script>
<!--        <script>
            var wavesurfer = Object.create(WaveSurfer);

            wavesurfer.init({
                container: document.querySelector('#wave'),
                waveColor: 'violet',
                progressColor: 'purple'
            });

            wavesurfer.on('ready', function() {
                wavesurfer.play();
            });

            wavesurfer.load('example/media/demo.wav');
        </script>-->
    </head>
    <body>

<!--
<div class="container">
    <div id="demo">-->
                <div id="waveform">
                    <div class="progress progress-striped active" id="progress-bar">
                        <div class="progress-bar progress-bar-info"></div>
                    </div>

                    <!-- Here be the waveform -->
                </div>

                <div class="controls">
                    <button class="btn btn-primary" data-action="back">
                        <i class="glyphicon glyphicon-step-backward"></i>
                        Backward
                    </button>

                    <button class="btn btn-primary" data-action="play">
                        <i class="glyphicon glyphicon-play"></i>
                        Play
                        /
                        <i class="glyphicon glyphicon-pause"></i>
                        Pause
                    </button>

                    <button class="btn btn-primary" data-action="forth">
                        <i class="glyphicon glyphicon-step-forward"></i>
                        Forward
                    </button>

                    <button class="btn btn-primary" data-action="toggle-mute">
                        <i class="glyphicon glyphicon-volume-off"></i>
                        Toggle Mute
                    </button>
                </div>
<!--            </div>
</div>-->
    </body>
</html>
