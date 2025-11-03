<%-- 
    Document   : index1
    Created on : 27 oct. 2025, 08:49:58
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
</html><!DOCTYPE html>
<html lang="es" class="h-full">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Panel Administrativo - Sistema de Gestión de Tesis</title>
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
<body class="h-full bg-gradient-to-br from-red-50 to-pink-100 fade-in">
    <div class="flex flex-col lg:flex-row h-full">
        <!-- Sidebar -->
        <div class="w-full lg:w-1/5 bg-gradient-to-b from-red-800 to-red-900 shadow-xl min-h-full">
            <div class="p-4 lg:p-6 h-full flex flex-col">
                <!-- User Profile -->
                <div class="text-center mb-6 lg:mb-8">
                    <div class="mx-auto h-16 w-16 lg:h-20 lg:w-20 bg-red-600 rounded-full flex items-center justify-center mb-4 shadow-lg">
                        <svg class="h-8 w-8 lg:h-10 lg:w-10 text-white" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M16 7a4 4 0 11-8 0 4 4 0 018 0zM12 14a7 7 0 00-7 7h14a7 7 0 00-7-7z"></path>
                        </svg>
                    </div>
                    <h3 class="text-white font-semibold text-lg">Carlos Rodríguez</h3>
                    <p class="text-red-200 text-sm">Administrador del Sistema</p>
                    <div class="mt-2 inline-flex items-center px-2.5 py-0.5 rounded-full text-xs font-medium bg-red-100 text-red-800">
                        <span class="w-2 h-2 bg-green-400 rounded-full mr-1.5"></span>
                        En línea
                    </div>
                </div>

                <!-- Navigation Menu -->
                <nav class="space-y-2 flex-1">
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-white bg-red-700 rounded-lg hover:bg-red-600 transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M3 7v10a2 2 0 002 2h14a2 2 0 002-2V9a2 2 0 00-2-2H5a2 2 0 00-2-2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Dashboard</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-red-200 hover:text-white hover:bg-red-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 4.354a4 4 0 110 5.292M15 21H3v-1a6 6 0 0112 0v1zm0 0h6v-1a6 6 0 00-9-5.197m13.5-9a2.5 2.5 0 11-5 0 2.5 2.5 0 015 0z"></path>
                        </svg>
                        <span class="hidden sm:inline">Usuarios</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-red-200 hover:text-white hover:bg-red-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Tesis</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-red-200 hover:text-white hover:bg-red-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z"></path>
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 12a3 3 0 11-6 0 3 3 0 016 0z"></path>
                        </svg>
                        <span class="hidden sm:inline">Configuración</span>
                    </button>
                    <button class="w-full text-left px-3 lg:px-4 py-2 lg:py-3 text-red-200 hover:text-white hover:bg-red-700 rounded-lg transition flex items-center text-sm lg:text-base">
                        <svg class="h-4 w-4 lg:h-5 lg:w-5 mr-2 lg:mr-3" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 19v-6a2 2 0 00-2-2H5a2 2 0 00-2 2v6a2 2 0 002 2h2a2 2 0 002-2zm0 0V9a2 2 0 012-2h2a2 2 0 012 2v10m-6 0a2 2 0 002 2h2a2 2 0 002-2m0 0V5a2 2 0 012-2h2a2 2 0 012 2v14a2 2 0 01-2 2h-2a2 2 0 01-2-2z"></path>
                        </svg>
                        <span class="hidden sm:inline">Reportes</span>
                    </button>
                </nav>
            </div>
        </div>

        <!-- Main Content -->
        <div class="flex-1 flex flex-col min-h-0">
            <!-- Header -->
            <header class="bg-white shadow-sm border-b border-red-200 flex-shrink-0">
                <div class="px-4 lg:px-6 py-4">
                    <div class="flex items-center justify-between">
                        <div>
                            <h1 class="text-xl lg:text-2xl font-bold text-gray-900">Panel Administrativo</h1>
                            <p class="text-xs lg:text-sm text-gray-600 hidden sm:block">Gestiona usuarios, tesis y configuraciones del sistema</p>
                        </div>
                        <div class="flex items-center space-x-4">
                            <div class="relative">
                                <button class="p-2 text-gray-400 hover:text-gray-600 relative">
                                    <svg class="h-5 w-5 lg:h-6 lg:w-6" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 17h5l-5 5v-5zM4 19h6v-7a1 1 0 011-1h4a1 1 0 011 1v7h6"></path>
                                    </svg>
                                    <span class="absolute -top-1 -right-1 h-4 w-4 bg-red-500 rounded-full text-xs text-white flex items-center justify-center">3</span>
                                </button>
                            </div>
                            <button onclick="logout()" class="bg-red-600 hover:bg-red-500 text-white px-3 lg:px-4 py-2 rounded-lg font-medium transition flex items-center text-sm">
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
                <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4 lg:gap-6 mb-6 lg:mb-8">
                    <div class="bg-gradient-to-r from-red-500 to-red-600 overflow-hidden shadow-lg rounded-xl">
                        <div class="p-4 lg:p-6 text-white">
                            <div class="flex items-center">
                                <div class="flex-shrink-0">
                                    <svg class="h-6 w-6 lg:h-8 lg:w-8" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 4.354a4 4 0 110 5.292M15 21H3v-1a6 6 0 0112 0v1zm0 0h6v-1a6 6 0 00-9-5.197m13.5-9a2.5 2.5 0 11-5 0 2.5 2.5 0 015 0z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-red-100 truncate">Total Usuarios</dt>
                                        <dd class="text-xl lg:text-2xl font-bold">247</dd>
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
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12h6m-6 4h6m2 5H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-orange-100 truncate">Tesis Registradas</dt>
                                        <dd class="text-xl lg:text-2xl font-bold">89</dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="bg-gradient-to-r from-yellow-500 to-yellow-600 overflow-hidden shadow-lg rounded-xl">
                        <div class="p-4 lg:p-6 text-white">
                            <div class="flex items-center">
                                <div class="flex-shrink-0">
                                    <svg class="h-6 w-6 lg:h-8 lg:w-8" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-yellow-100 truncate">En Revisión</dt>
                                        <dd class="text-xl lg:text-2xl font-bold">23</dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="bg-gradient-to-r from-green-500 to-green-600 overflow-hidden shadow-lg rounded-xl">
                        <div class="p-4 lg:p-6 text-white">
                            <div class="flex items-center">
                                <div class="flex-shrink-0">
                                    <svg class="h-6 w-6 lg:h-8 lg:w-8" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 12l2 2 4-4m6 2a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                                    </svg>
                                </div>
                                <div class="ml-3 lg:ml-5 w-0 flex-1">
                                    <dl>
                                        <dt class="text-xs lg:text-sm font-medium text-green-100 truncate">Aprobadas</dt>
                                        <dd class="text-xl lg:text-2xl font-bold">156</dd>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Action Cards -->
                <div class="grid grid-cols-1 lg:grid-cols-2 gap-4 lg:gap-6">
                    <div class="bg-white shadow-xl rounded-xl border border-red-100">
                        <div class="px-4 lg:px-6 py-4 lg:py-6">
                            <div class="flex items-center mb-4">
                                <div class="h-8 w-8 lg:h-10 lg:w-10 bg-red-100 rounded-lg flex items-center justify-center">
                                    <svg class="h-4 w-4 lg:h-6 lg:w-6 text-red-600" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 4.354a4 4 0 110 5.292M15 21H3v-1a6 6 0 0112 0v1zm0 0h6v-1a6 6 0 00-9-5.197m13.5-9a2.5 2.5 0 11-5 0 2.5 2.5 0 015 0z"></path>
                                    </svg>
                                </div>
                                <h3 class="ml-3 text-base lg:text-lg font-semibold text-gray-900">Gestión de Usuarios</h3>
                            </div>
                            <div class="space-y-3">
                                <button class="w-full bg-gradient-to-r from-red-600 to-red-700 hover:from-red-700 hover:to-red-800 text-white px-4 py-2 lg:py-3 rounded-lg font-medium transition shadow-lg text-sm lg:text-base">
                                    Crear Nuevo Usuario
                                </button>
                                <button class="w-full bg-red-50 hover:bg-red-100 text-red-700 px-4 py-2 lg:py-3 rounded-lg font-medium transition border border-red-200 text-sm lg:text-base">
                                    Ver Todos los Usuarios
                                </button>
                                <button class="w-full bg-red-50 hover:bg-red-100 text-red-700 px-4 py-2 lg:py-3 rounded-lg font-medium transition border border-red-200 text-sm lg:text-base">
                                    Gestionar Permisos
                                </button>
                            </div>
                        </div>
                    </div>

                    <div class="bg-white shadow-xl rounded-xl border border-red-100">
                        <div class="px-4 lg:px-6 py-4 lg:py-6">
                            <div class="flex items-center mb-4">
                                <div class="h-8 w-8 lg:h-10 lg:w-10 bg-orange-100 rounded-lg flex items-center justify-center">
                                    <svg class="h-4 w-4 lg:h-6 lg:w-6 text-orange-600" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M10.325 4.317c.426-1.756 2.924-1.756 3.35 0a1.724 1.724 0 002.573 1.066c1.543-.94 3.31.826 2.37 2.37a1.724 1.724 0 001.065 2.572c1.756.426 1.756 2.924 0 3.35a1.724 1.724 0 00-1.066 2.573c.94 1.543-.826 3.31-2.37 2.37a1.724 1.724 0 00-2.572 1.065c-.426 1.756-2.924 1.756-3.35 0a1.724 1.724 0 00-2.573-1.066c-1.543.94-3.31-.826-2.37-2.37a1.724 1.724 0 00-1.065-2.572c-1.756-.426-1.756-2.924 0-3.35a1.724 1.724 0 001.066-2.573c-.94-1.543.826-3.31 2.37-2.37.996.608 2.296.07 2.572-1.065z"></path>
                                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 12a3 3 0 11-6 0 3 3 0 016 0z"></path>
                                    </svg>
                                </div>
                                <h3 class="ml-3 text-base lg:text-lg font-semibold text-gray-900">Configuración del Sistema</h3>
                            </div>
                            <div class="space-y-3">
                                <button class="w-full bg-gradient-to-r from-orange-600 to-orange-700 hover:from-orange-700 hover:to-orange-800 text-white px-4 py-2 lg:py-3 rounded-lg font-medium transition shadow-lg text-sm lg:text-base">
                                    Configurar Períodos Académicos
                                </button>
                                <button class="w-full bg-orange-50 hover:bg-orange-100 text-orange-700 px-4 py-2 lg:py-3 rounded-lg font-medium transition border border-orange-200 text-sm lg:text-base">
                                    Gestionar Categorías
                                </button>
                                <button class="w-full bg-orange-50 hover:bg-orange-100 text-orange-700 px-4 py-2 lg:py-3 rounded-lg font-medium transition border border-orange-200 text-sm lg:text-base">
                                    Reportes del Sistema
                                </button>
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