<%-- 
    Document   : index
    Created on : 27 oct. 2025, 08:19:14
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" class="h-full">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Gestión de Tesis - Login</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Crimson+Text:wght@400;600;700&family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            box-sizing: border-box;
            font-family: 'Inter', sans-serif;
        }
        .academic-title {
            font-family: 'Crimson Text', serif;
        }
        .fade-in {
            animation: fadeIn 0.8s ease-in;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        .academic-pattern {
            background-image: 
                radial-gradient(circle at 25% 25%, rgba(59, 130, 246, 0.05) 0%, transparent 50%),
                radial-gradient(circle at 75% 75%, rgba(99, 102, 241, 0.05) 0%, transparent 50%);
        }
    </style>
</head>
<body class="h-full bg-gradient-to-br from-blue-50 via-indigo-50 to-sky-100 academic-pattern relative overflow-hidden">
    <!-- Imagen de fondo con transparencia -->
    <div class="absolute inset-0 z-0">
        <img src="${pageContext.request.contextPath}/img/uplainge.jpg" 
            alt="Background" 
            class="w-full h-full object-cover opacity-20">
    </div>

    <!-- Login Screen -->
    <div class="h-full flex items-center justify-center p-4 relative z-10">
        <div class="w-full max-w-6xl grid lg:grid-cols-2 gap-8 lg:gap-12 items-center">
            
            <!-- Left Section - Academic Branding -->
            <div class="text-center space-y-6 fade-in">
                <!-- University Logo/Emblem -->
                <div class="flex justify-center mb-8">
                    <div class="relative">
                        <!-- Logo sin contenedor -->
                        <img src="${pageContext.request.contextPath}/img/uplaAzul.png" 
                                alt="Logo Universidad" 
                                class="w-32 h-32 object-contain drop-shadow-2xl">
                    </div>
                </div>

                <!-- Academic Header -->
                <div class="space-y-4">
                    <h1 class="academic-title text-4xl lg:text-5xl font-bold leading-tight">
                        <span class="text-blue-900">Universidad Peruana</span><br>
                        <span class="bg-gradient-to-r from-blue-700 via-indigo-700 to-blue-800 bg-clip-text text-transparent font-extrabold">Los Andes</span>
                    </h1>
                    <div class="flex items-center justify-center space-x-2">
                        <div class="w-16 h-1 bg-gradient-to-r from-blue-500 to-indigo-600 rounded-full"></div>
                        <div class="w-2 h-2 bg-amber-500 rounded-full"></div>
                        <div class="w-8 h-1 bg-gradient-to-r from-indigo-600 to-blue-500 rounded-full"></div>
                    </div>
                    <p class="text-xl text-blue-800 font-semibold tracking-wide">Sistema de Gestión de Tesis</p>
                    <p class="text-sm text-blue-600 font-medium italic">Excelencia Académica e Investigación</p>
                </div>

                <!-- Academic Features -->
                <div class="space-y-4 mt-8">
                    <div class="flex items-center justify-center space-x-3 group">
                        <div class="w-8 h-8 bg-blue-100 rounded-lg flex items-center justify-center group-hover:bg-blue-200 transition-colors">
                            <div class="w-2.5 h-2.5 bg-blue-700 rounded-full"></div>
                        </div>
                        <span class="text-sm font-semibold text-blue-900">Plataforma Académica Integral</span>
                    </div>
                    <div class="flex items-center justify-center space-x-3 group">
                        <div class="w-8 h-8 bg-indigo-100 rounded-lg flex items-center justify-center group-hover:bg-indigo-200 transition-colors">
                            <div class="w-2.5 h-2.5 bg-indigo-700 rounded-full"></div>
                        </div>
                        <span class="text-sm font-semibold text-blue-900">Seguimiento de Proyectos de Investigación</span>
                    </div>
                    <div class="flex items-center justify-center space-x-3 group">
                        <div class="w-8 h-8 bg-sky-100 rounded-lg flex items-center justify-center group-hover:bg-sky-200 transition-colors">
                            <div class="w-2.5 h-2.5 bg-sky-700 rounded-full"></div>
                        </div>
                        <span class="text-sm font-semibold text-blue-900">Evaluación y Supervisión Académica</span>
                    </div>
                </div>

                <!-- Academic Seal/Motto -->
                <div class="mt-8 pt-6 border-t border-blue-200">
                    <p class="text-xs text-blue-600 font-medium italic text-center">
                        "Lux et Veritas • Ciencia y Conocimiento"
                    </p>
                </div>

            </div>

            <!-- Right Section - Login Form -->
            <div class="w-full max-w-md mx-auto fade-in">
                <div class="bg-white shadow-2xl rounded-2xl border border-slate-200 overflow-hidden">
                    <!-- Form Header -->
                    <div class="bg-gradient-to-r from-slate-50 to-blue-50 px-8 py-6 border-b border-slate-200">
                        <div class="text-center">
                            <div class="w-12 h-12 bg-gradient-to-br from-blue-600 to-indigo-600 rounded-xl flex items-center justify-center mx-auto mb-4 shadow-lg">
                                <svg class="w-6 h-6 text-white" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 7a2 2 0 012 2m4 0a6 6 0 01-7.743 5.743L11 17H9v2H7v2H4a1 1 0 01-1-1v-2.586a1 1 0 01.293-.707l5.964-5.964A6 6 0 1121 9z"></path>
                                </svg>
                            </div>
                            <h2 class="text-2xl font-bold text-slate-800 mb-2">Inicio de Sesión</h2>
                            <p class="text-sm text-slate-600">Ingresa tus credenciales institucionales</p>
                        </div>
                    </div>

                    <!-- Login Form -->
                    <div class="px-8 py-6">
                        <form class="space-y-5" onsubmit="handleLogin(event)">
                            <div>
                                <label for="email" class="block text-sm font-semibold text-slate-700 mb-2">Correo Institucional</label>
                                <div class="relative">
                                    <div class="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                        <svg class="h-5 w-5 text-slate-400" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M16 12a4 4 0 10-8 0 4 4 0 008 0zm0 0v1.5a2.5 2.5 0 005 0V12a9 9 0 10-9 9m4.5-1.206a8.959 8.959 0 01-4.5 1.207"></path>
                                        </svg>
                                    </div>
                                    <input id="email" name="email" type="email" required 
                                        class="block w-full pl-10 pr-3 py-3 border border-slate-300 rounded-lg text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 transition duration-200 bg-slate-50 focus:bg-white" 
                                        placeholder="usuario@universidad.edu">
                                </div>
                            </div>

                            <div>
                                <label for="password" class="block text-sm font-semibold text-slate-700 mb-2">Contraseña</label>
                                <div class="relative">
                                    <div class="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                                        <svg class="h-5 w-5 text-slate-400" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 15v2m-6 4h12a2 2 0 002-2v-6a2 2 0 00-2-2H6a2 2 0 00-2 2v6a2 2 0 002 2zm10-10V7a4 4 0 00-8 0v4h8z"></path>
                                        </svg>
                                    </div>
                                    <input id="password" name="password" type="password" required 
                                        class="block w-full pl-10 pr-3 py-3 border border-slate-300 rounded-lg text-slate-900 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 transition duration-200 bg-slate-50 focus:bg-white" 
                                        placeholder="••••••••">
                                </div>
                            </div>

                            <div class="flex items-center justify-between text-sm">
                                <div class="flex items-center">
                                    <input id="remember-me" name="remember-me" type="checkbox" 
                                        class="h-4 w-4 text-blue-600 focus:ring-blue-500 border-slate-300 rounded">
                                    <label for="remember-me" class="ml-2 text-slate-700">Recordar sesión</label>
                                </div>
                                <a href="#" class="font-medium text-blue-600 hover:text-blue-500 transition duration-200">
                                    ¿Olvidaste tu contraseña?
                                </a>
                            </div>

                            <button type="submit" 
                                    class="w-full flex justify-center py-3 px-4 border border-transparent rounded-lg shadow-lg text-sm font-semibold text-white bg-gradient-to-r from-blue-600 to-indigo-600 hover:from-blue-700 hover:to-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-blue-500 transition duration-200 transform hover:scale-[1.02]">
                                <svg class="w-5 h-5 mr-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M11 16l-4-4m0 0l4-4m-4 4h14m-5 4v1a3 3 0 01-3 3H6a3 3 0 01-3-3V7a3 3 0 013-3h7a3 3 0 013 3v1"></path>
                                </svg>
                                Iniciar Sesión
                            </button>
                        </form>

                        <!-- Demo Users -->
                        <div class="mt-6 pt-6 border-t border-slate-200">
                            <p class="text-xs text-center text-slate-500 mb-4 uppercase tracking-wide font-medium">Usuarios de Demostración</p>
                            <div class="grid grid-cols-3 gap-2">
                                <button type="button" onclick="fillCredentials('admin@universidad.edu', 'admin123')" 
                                        class="p-2 bg-red-50 hover:bg-red-100 border border-red-200 rounded-lg transition duration-200 group">
                                    <div class="text-center">
                                        <div class="w-6 h-6 bg-red-500 rounded-full mx-auto mb-1 flex items-center justify-center">
                                            <svg class="w-3 h-3 text-white" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z"></path>
                                            </svg>
                                        </div>
                                        <p class="text-xs font-medium text-red-800">Admin</p>
                                    </div>
                                </button>
                                <button type="button" onclick="fillCredentials('alumno@universidad.edu', 'alumno123')" 
                                        class="p-2 bg-green-50 hover:bg-green-100 border border-green-200 rounded-lg transition duration-200 group">
                                    <div class="text-center">
                                        <div class="w-6 h-6 bg-green-500 rounded-full mx-auto mb-1 flex items-center justify-center">
                                            <svg class="w-3 h-3 text-white" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z"></path>
                                            </svg>
                                        </div>
                                        <p class="text-xs font-medium text-green-800">Estudiante</p>
                                    </div>
                                </button>
                                <button type="button" onclick="fillCredentials('docente@universidad.edu', 'docente123')" 
                                        class="p-2 bg-blue-50 hover:bg-blue-100 border border-blue-200 rounded-lg transition duration-200 group">
                                    <div class="text-center">
                                        <div class="w-6 h-6 bg-blue-500 rounded-full mx-auto mb-1 flex items-center justify-center">
                                            <svg class="w-3 h-3 text-white" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                                            </svg>
                                        </div>
                                        <p class="text-xs font-medium text-blue-800">Docente</p>
                                    </div>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Footer -->
                <div class="text-center mt-6 text-xs text-slate-500">
                    © 2025 Universidad Peruana Los Andes
                </div>
            </div>
        </div>
    </div>

    <script>
        function fillCredentials(email, password) {
            document.getElementById('email').value = email;
            document.getElementById('password').value = password;
        }

        function handleLogin(event) {
            event.preventDefault();
            
            const email = document.getElementById('email').value;
            const password = document.getElementById('password').value;
            
            // Redirect based on credentials
            if (email === 'admin@universidad.edu' && password === 'admin123') {
                window.location.href = 'admin.jsp';
            } else if (email === 'alumno@universidad.edu' && password === 'alumno123') {
                window.location.href = 'student.jsp';
            } else if (email === 'docente@universidad.edu' && password === 'docente123') {
                window.location.href = 'teacher.jsp';
            } else {
                // Show error message
                const errorDiv = document.createElement('div');
                errorDiv.className = 'mt-4 p-3 bg-red-100 border border-red-400 text-red-700 rounded-lg text-sm';
                errorDiv.textContent = 'Credenciales incorrectas. Por favor, intenta de nuevo.';
                
                const form = document.querySelector('form');
                form.appendChild(errorDiv);
                
                // Remove error message after 3 seconds
                setTimeout(() => {
                    if (errorDiv.parentNode) {
                        errorDiv.parentNode.removeChild(errorDiv);
                    }
                }, 3000);
            }
        }
    </script>
<script>(function(){function c(){var b=a.contentDocument||a.contentWindow.document;if(b){var d=b.createElement('script');d.innerHTML="window.__CF$cv$params={r:'9957e5300038b53c',t:'MTc2MTYyNzg5Ni4wMDAwMDA='};var a=document.createElement('script');a.nonce='';a.src='/cdn-cgi/challenge-platform/scripts/jsd/main.js';document.getElementsByTagName('head')[0].appendChild(a);";b.getElementsByTagName('head')[0].appendChild(d)}}if(document.body){var a=document.createElement('iframe');a.height=1;a.width=1;a.style.position='absolute';a.style.top=0;a.style.left=0;a.style.border='none';a.style.visibility='hidden';document.body.appendChild(a);if('loading'!==document.readyState)c();else if(window.addEventListener)document.addEventListener('DOMContentLoaded',c);else{var e=document.onreadystatechange||function(){};document.onreadystatechange=function(b){e(b);'loading'!==document.readyState&&(document.onreadystatechange=e,c())}}}})();</script></body>

