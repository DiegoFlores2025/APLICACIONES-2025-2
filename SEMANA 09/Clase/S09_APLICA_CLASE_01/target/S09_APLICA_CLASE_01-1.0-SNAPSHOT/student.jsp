<%-- 
    Document   : index2
    Created on : 27 oct. 2025, 08:50:03
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" class="h-full">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal del Estudiante - Sistema de Gestión de Tesis</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            box-sizing: border-box;
            font-family: 'Inter', sans-serif;
        }
        .fade-in {
            animation: fadeIn 0.5s ease-in;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        .card-hover {
            transition: all 0.3s ease;
        }
        .card-hover:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body class="h-full bg-gradient-to-br from-green-50 to-emerald-100 fade-in">
    <div class="flex flex-col lg:flex-row h-full">
        <!-- Sidebar -->
        <div class="w-full lg:w-1/5 bg-gradient-to-b from-green-800 to-green-900 shadow-xl min-h-full">
            <div class="p-4 lg:p-6 h-full flex flex-col">
                <!-- User Profile -->
                <div class="text-center mb-6 lg:mb-8">
                    <div class="mx-auto h-16 w-16 lg:h-20 lg:w-20 bg-green-600 rounded-full flex items-center justify-center mb-4 shadow-lg">
                        <svg class="h-8 w-8 lg:h-10 lg:w-10 text-white" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z"></path>
                        </svg>
                    </div>
                    <h3 class="text-white font-semibold text-lg">Juan Pérez</h3>
                    <p class="text-green-200 text-sm">Estudiante de Ingeniería</p>
                    <p class="text-green-300 text-xs">ID: 2021-0456</p>
                    <div class="mt-2 inline-flex items-center px-2.5 py-0.5 rounded-full text-xs font-medium bg-green-100 text-green-800">
                        <span class="w-2 h-2 bg-green-400 rounded-full mr-1.5"></span>
                        Activo
                    </div>
                </div>

                <!-- Navigation Menu -->
                <nav class="space-y-2 flex-1">
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-white bg-green-700 rounded-lg hover:bg-green-600 transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M3 7v10a2 2 0 002 2h14a2 2 0 002-2V9a2 2 0 00-2-2H5a2 2 0 00-2-2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Mi Dashboard</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-green-200 hover:text-white hover:bg-green-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Mi Tesis</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-green-200 hover:text-white hover:bg-green-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M8 7V3a4 4 0 118 0v4m-4 8a2 2 0 100-4 2 2 0 000 4zm6-6V7a2 2 0 00-2-2H6a2 2 0 00-2 2v4a2 2 0 002 2h8a2 2 0 002-2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Documentos</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-green-200 hover:text-white hover:bg-green-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M8 12h.01M12 12h.01M16 12h.01M21 12c0 4.418-4.03 8-9 8a9.863 9.863 0 01-4.255-.949L3 20l1.395-3.72C3.512 15.042 3 13.574 3 12c0-4.418 4.03-8 9-8s9 3.582 9 8z"></path>
                        </svg>
                        <span class="hidden sm:inline">Mensajes</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-green-200 hover:text-white hover:bg-green-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M8 7V3a4 4 0 118 0v4m-4 8a2 2 0 100-4 2 2 0 000 4zm6-6V7a2 2 0 00-2-2H6a2 2 0 00-2 2v4a2 2 0 002 2h8a2 2 0 002-2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Mi Perfil</span>
                    </button>
                </nav>
            </div>
        </div>

        <!-- Main Content -->
        <div class="flex-1 flex flex-col min-h-0">
            <!-- Header -->
            <header class="bg-white shadow-sm border-b border-green-200 flex-shrink-0">
                <div class="px-4 lg:px-6 py-4">
                    <div class="flex items-center justify-between">
                        <div>
                            <h1 class="text-xl lg:text-2xl font-bold text-gray-900">Portal del Estudiante</h1>
                            <p class="text-xs lg:text-sm text-gray-600 hidden sm:block">Gestiona tu tesis y documentos académicos</p>
                        </div>
                        <div class="flex items-center space-x-4">
                            <div class="relative">
                                <button class="p-2 text-gray-400 hover:text-gray-600 relative">
                                    <svg class="h-5 w-5 lg:h-6 lg:w-6" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 17h5l-5 5v-5zM4 19h6v-7a1 1 0 011-1h4a1 1 0 011 1v7h6"></path>
                                    </svg>
                                    <span class="absolute -top-1 -right-1 h-4 w-4 bg-green-500 rounded-full text-xs text-white flex items-center justify-center">2</span>
                                </button>
                            </div>
                            <button onclick="logout()" class="bg-green-600 hover:bg-green-500 text-white px-3 lg:px-4 py-2 rounded-lg font-medium transition flex items-center text-sm">
                                <svg class="h-4 w-4 mr-1 lg:mr-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M17 16l4-4m0 0l-4-4m4 4H7m6 4v1a3 3 0 01-3 3H6a3 3 0 01-3-3V7a3 3 0 013-3h4a3 3 0 013 3v1"></path>
                                </svg>
                                <span class="hidden sm:inline">Cerrar Sesión</span>
                            </button>
                        </div>
                    </div>
                </div>
            </header>

            <!-- Dashboard Content -->
            <main class="flex-1 overflow-auto p-4 lg:p-6">
                <!-- Stats Cards -->
                <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4 lg:gap-6 mb-6 lg:mb-8">
                    <div class="bg-gradient-to-r from-green-500 to-green-600 overflow-hidden shadow-lg rounded-xl">
                        <div class="p-4 lg:p-6 text-white">
                            <div class="flex items-center">
                                <div class="flex-shrink-0">
                                    <svg class="h-6 w-6 lg:h-8 lg:w-8" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-green-100 truncate">Estado de Tesis</dt>
                                        <dd class="text-lg lg:text-xl font-bold">En Revisión</dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="bg-gradient-to-r from-blue-500 to-blue-600 overflow-hidden shadow-lg rounded-xl">
                        <div class="p-4 lg:p-6 text-white">
                            <div class="flex items-center">
                                <div class="flex-shrink-0">
                                    <svg class="h-6 w-6 lg:h-8 lg:w-8" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 19v-6a2 2 0 00-2-2H5a2 2 0 00-2 2v6a2 2 0 002 2h2a2 2 0 002-2zm0 0V9a2 2 0 012-2h2a2 2 0 012 2v10m-6 0a2 2 0 002 2h2a2 2 0 002-2m0 0V5a2 2 0 012-2h2a2 2 0 012 2v14a2 2 0 01-2 2h-2a2 2 0 01-2-2z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-blue-100 truncate">Progreso</dt>
                                        <dd class="text-lg lg:text-xl font-bold">75%</dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="bg-gradient-to-r from-orange-500 to-orange-600 overflow-hidden shadow-lg rounded-xl">
                        <div class="p-4 lg:p-6 text-white">
                            <div class="flex items-center">
                                <div class="flex-shrink-0">
                                    <svg class="h-6 w-6 lg:h-8 lg:w-8" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-orange-100 truncate">Días Restantes</dt>
                                        <dd class="text-lg lg:text-xl font-bold">45</dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Action Cards -->
                <div class="grid grid-cols-1 lg:grid-cols-2 gap-4 lg:gap-6">
                    <div class="bg-white shadow-xl rounded-xl border border-green-100">
                        <div class="px-4 lg:px-6 py-4 lg:py-6">
                            <div class="flex items-center mb-4">
                                <div class="h-8 w-8 lg:h-10 lg:w-10 bg-green-100 rounded-lg flex items-center justify-center">
                                    <svg class="h-4 w-4 lg:h-6 lg:w-6 text-green-600" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                                    </svg>
                                </div>
                                <h3 class="ml-3 text-base lg:text-lg font-semibold text-gray-900">Mi Tesis</h3>
                            </div>
                            <div class="bg-green-50 rounded-lg p-4 mb-4 border border-green-200">
                                <h4 class="font-semibold text-gray-900 text-sm lg:text-base">Análisis de Algoritmos de Machine Learning</h4>
                                <p class="text-xs lg:text-sm text-gray-600 mt-1">Última actualización: 15 de Noviembre, 2024</p>
                                <div class="mt-3">
                                    <div class="bg-gray-200 rounded-full h-2 lg:h-3">
                                        <div class="bg-gradient-to-r from-green-500 to-green-600 h-2 lg:h-3 rounded-full shadow-sm" style="width: 75%"></div>
                                    </div>
                                    <p class="text-xs text-gray-600 mt-1 font-medium">75% completado</p>
                                </div>
                            </div>
                            <div class="space-y-3">
                                <button class="w-full bg-gradient-to-r from-green-600 to-green-700 hover:from-green-700 hover:to-green-800 text-white px-4 py-2 lg:py-3 rounded-lg font-medium transition shadow-lg text-sm lg:text-base">
                                    Subir Nueva Versión
                                </button>
                                <button class="w-full bg-green-50 hover:bg-green-100 text-green-700 px-4 py-2 lg:py-3 rounded-lg font-medium transition border border-green-200 text-sm lg:text-base">
                                    Ver Comentarios del Tutor
                                </button>
                                <button class="w-full bg-green-50 hover:bg-green-100 text-green-700 px-4 py-2 lg:py-3 rounded-lg font-medium transition border border-green-200 text-sm lg:text-base">
                                    Descargar Documento
                                </button>
                            </div>
                        </div>
                    </div>

                    <div class="bg-white shadow-xl rounded-xl border border-green-100">
                        <div class="px-4 lg:px-6 py-4 lg:py-6">
                            <div class="flex items-center mb-4">
                                <div class="h-8 w-8 lg:h-10 lg:w-10 bg-blue-100 rounded-lg flex items-center justify-center">
                                    <svg class="h-4 w-4 lg:h-6 lg:w-6 text-blue-600" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                                    </svg>
                                </div>
                                <h3 class="ml-3 text-base lg:text-lg font-semibold text-gray-900">Actividades Recientes</h3>
                            </div>
                            <div class="space-y-3 lg:space-y-4">
                                <div class="flex items-start space-x-3 p-3 bg-green-50 rounded-lg border border-green-200">
                                    <div class="flex-shrink-0">
                                        <div class="h-2 w-2 lg:h-3 lg:w-3 bg-green-500 rounded-full mt-2"></div>
                                    </div>
                                    <div class="min-w-0 flex-1">
                                        <p class="text-xs lg:text-sm font-medium text-gray-900">Comentarios recibidos del tutor</p>
                                        <p class="text-xs text-gray-600">Hace 2 días</p>
                                    </div>
                                </div>
                                <div class="flex items-start space-x-3 p-3 bg-blue-50 rounded-lg border border-blue-200">
                                    <div class="flex-shrink-0">
                                        <div class="h-2 w-2 lg:h-3 lg:w-3 bg-blue-500 rounded-full mt-2"></div>
                                    </div>
                                    <div class="min-w-0 flex-1">
                                        <p class="text-xs lg:text-sm font-medium text-gray-900">Documento actualizado</p>
                                        <p class="text-xs text-gray-600">Hace 5 días</p>
                                    </div>
                                </div>
                                <div class="flex items-start space-x-3 p-3 bg-orange-50 rounded-lg border border-orange-200">
                                    <div class="flex-shrink-0">
                                        <div class="h-2 w-2 lg:h-3 lg:w-3 bg-orange-500 rounded-full mt-2"></div>
                                    </div>
                                    <div class="min-w-0 flex-1">
                                        <p class="text-xs lg:text-sm font-medium text-gray-900">Reunión programada</p>
                                        <p class="text-xs text-gray-600">Hace 1 semana</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>

            <!-- Footer -->
            <footer class="bg-white border-t border-red-200 flex-shrink-0">
                <div class="px-4 lg:px-6 py-4">
                    <div class="flex flex-col sm:flex-row justify-between items-center">
                        <div class="text-xs lg:text-sm text-gray-600 mb-2 sm:mb-0">
                            © 2025 Universidad Peruana Los Andes. Sistema de Gestión de Tesis
                        </div>
                        <div class="flex items-center space-x-4 text-xs lg:text-sm text-gray-500">
                            <span>Soporte: soporte@upla.edu.pe</span>
                            <span class="hidden sm:inline">|</span>
                            <span>Tel: +1 (555) 123-4567</span>
                        </div>
                    </div>
                </div>
            </footer>
        </div>
    </div>

    <script>
        function logout() {
            window.location.href = 'login.jsp';
        }
    </script>
</body>
</html>