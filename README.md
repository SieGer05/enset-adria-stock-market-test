# Stock Market Microservices Project

## Table of Contents

1. [Project Overview](#project-overview)
2. [Architecture](#architecture)
3. [Implemented Microservices](#implemented-microservices)

   * [Gateway Service](#gateway-service)
   * [Discovery Service](#discovery-service)
   * [Config Service](#config-service)
   * [Stock-Service](#stock-service)
   * [MCP Server](#mcp-server)
4. [Testing](#testing)
5. [Screenshots](#screenshots)
6. [Getting Started](#getting-started)

---

## Project Overview

Ce projet consiste à concevoir et développer un système distribué basé sur une architecture **micro-services** avec **Spring Cloud**, permettant de gérer les cotations boursières des entreprises cotées en bourse. Jusqu'à présent, les micro-services suivants ont été implémentés :

* Gateway Service
* Discovery Service
* Config Service
* Stock-Service
* MCP Server

Ces micro-services sont exposés via **REST API** et **MCP (Model Context Protocol)**.

---

## Architecture

L'architecture générale est composée de :

* **Gateway Service** : routage et gestion des API
* **Discovery Service** : découverte automatique des micro-services via Eureka
* **Config Service** : centralisation de la configuration
* **Stock-Service** : gestion des cotations boursières
* **MCP Server** : exposition des outils aux agents AI

Chaque micro-service suit la structure standard Spring Boot :

* Entities & DTO
* Repository
* Service
* Controller
* AI Tools (pour MCP)

---

## Implemented Microservices

### Gateway Service

Routage des requêtes vers les micro-services et gestion centralisée des endpoints.

### Discovery Service

Basé sur **Eureka**, permet de découvrir et de centraliser tous les micro-services.

### Config Service

Centralisation des configurations de tous les micro-services via un dépôt GitHub.

### Stock-Service

**Fonctionnalités implémentées :**

* Création d’une cotation
* Récupération des cotations
* Test des configurations via Config Service
* Endpoints REST testés avec Postman

### MCP Server

Expose les outils du micro-service Stock-Service aux agents AI.

---

## Testing

* **Eureka Dashboard** : vérification que tous les micro-services sont découverts.
* **Postman** : tests des endpoints REST du Stock-Service (GET, POST).
* **Config Service** : test des configurations centralisées.

---

## Screenshots
- Premiére test d'Eureka Discovery.
![](/Screenshots/screenshot-1-Eureka-stock-good.png)

- Centraliser la configuration dans un repo github: https://github.com/SieGer05/stock-exchange-config
![](/Screenshots/screenshot-2-remote-repo-for-configuration.png)

- Tester la configuration depuis la Gateway:
![](/Screenshots/screenshot-4-test-gateway-success.png)

- Test de récupérer tous le stock:
![](/Screenshots/screenshot-5-test-stock-service-postman.png)
---

## Getting Started

### Prérequis

* Java 17+
* Maven
* Spring Boot 3+
* Postman (pour tests API)

### Instructions

1. Cloner le dépôt GitHub :

```bash
git clone <repo_url>
```

2. Démarrer le **Config Service**
3. Démarrer le **Discovery Service**
4. Démarrer le **Gateway Service**
5. Démarrer le **Stock-Service**
6. Démarrer le **MCP Server**
7. Tester les endpoints via Postman

---

*README mis à jour pour refléter uniquement ce qui a été implémenté jusqu'à présent et inclure MCP Server.*
